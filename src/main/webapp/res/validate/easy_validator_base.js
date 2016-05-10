/* Copyright (c) 2010 Brandon Aaron (http://brandonaaron.net)
 * Licensed under the MIT License (LICENSE.txt).
 *
 * Version 2.1.2
 */
(function(a){a.fn.bgiframe=(a.browser.msie&&/msie 6\.0/i.test(navigator.userAgent)?function(d){d=a.extend({top:"auto",left:"auto",width:"auto",height:"auto",opacity:true,src:"javascript:false;"},d);var c='<iframe class="bgiframe"frameborder="0"tabindex="-1"src="'+d.src+'"style="display:block;position:absolute;z-index:-1;'+(d.opacity!==false?"filter:Alpha(Opacity='0');":"")+"top:"+(d.top=="auto"?"expression(((parseInt(this.parentNode.currentStyle.borderTopWidth)||0)*-1)+'px')":b(d.top))+";left:"+(d.left=="auto"?"expression(((parseInt(this.parentNode.currentStyle.borderLeftWidth)||0)*-1)+'px')":b(d.left))+";width:"+(d.width=="auto"?"expression(this.parentNode.offsetWidth+'px')":b(d.width))+";height:"+(d.height=="auto"?"expression(this.parentNode.offsetHeight+'px')":b(d.height))+';"/>';return this.each(function(){if(a(this).children("iframe.bgiframe").length===0){this.insertBefore(document.createElement(c),this.firstChild)}})}:function(){return this});a.fn.bgIframe=a.fn.bgiframe;function b(c){return c&&c.constructor===Number?c+"px":c}})(jQuery);

/*
	Copyright (C) 2009 - 2012
	WebSite:	Http://wangking717.javaeye.com/
	Author:		wangking
*/
$(function(){
	var xOffset = -10; // x distance from mouse
    var yOffset = 10; // y distance from mouse  
	
	//input action
	/*$("[reg],[url]:not([reg]),[tip]").hover(
		function(e) {
			if($(this).attr('tip') != undefined){
				var top = (e.pageY + yOffset);
				var left = (e.pageX + xOffset);
				$('body').append( '<p id="vtip"><img id="vtipArrow" src="/dldx_eshop/using/api/images/vtip_arrow.png"/>' + $(this).attr('tip') + '</p>' );
				$('p#vtip').css("top", top+"px").css("left", left+"px");
				$('p#vtip').bgiframe();
			}
		},
		function() {
			if($(this).attr('tip') != undefined){
				$("p#vtip").remove();
			}
		}
	).mousemove(
		function(e) {
			if($(this).attr('tip') != undefined){
				var top = (e.pageY + yOffset);
				var left = (e.pageX + xOffset);
				$("p#vtip").css("top", top+"px").css("left", left+"px");
			}
		}
	).blur(function(){
		if($(this).attr("reg") != undefined){
			validate($(this));
		}else if($(this).attr("url") != undefined){
			ajax_validate($(this));
		}
	});	*/
	$("[reg],[url]:not([reg]),[tip]").die().live({
		blur:function(){
			if($(this).attr('tip') != undefined){
				$("p#vtip").remove();
			}
			if($(this).attr("reg") != undefined){
				validate($(this));
			}else if($(this).attr("url") != undefined){
				ajax_validate($(this));
			}
		},
		focus:function(e){
			if($(this).attr('tip') != undefined){
				var top=$(this).offset().top-15;
				var left=$(this).offset().left+8;
				var width=$(this).width();
				$('body').append( '<p id="vtip"><font color="red">*</font>&nbsp;' + $(this).attr('tip') + '&nbsp;<font color="red">*</font></p>' );
				//var top = (e.pageY + yOffset);
				//var left = (e.pageX + xOffset);
				$("p#vtip").css("top", top+"px").css("left",(left+width)+"px");
				$('p#vtip').bgiframe();
			}
		}
	})
});

function validate(obj){
	var reg = new RegExp(obj.attr("reg"));
	var regStr=obj.attr("reg");
	var objValue = $.trim(obj.attr("value"));
	var is=true;
	if(regStr=="^.*[^\\s]+.*$"||regStr=="not_null"){
		if(objValue.replace(/[\s]/g,"")==""){
			is=false;
		}
	}else if(!reg.test(objValue)){
		is=false;
	}
	if(is){
		change_error_style(obj,"remove");
		change_tip(obj,null,"remove");
	}else{
		change_error_style(obj,"add");
		change_tip(obj,null,"remove");
	}
	return is;
}

function ajax_validate(obj){
	
	var url_str = obj.attr("url");
	if(url_str.indexOf("?") != -1){
		url_str = url_str+"&"+obj.attr("name")+"="+obj.attr("value");
	}else{
		url_str = url_str+"?"+obj.attr("name")+"="+obj.attr("value");
	}
	var feed_back = $.ajax({url: url_str,cache: false,async: false}).responseText;
	feed_back = feed_back.replace(/(^\s*)|(\s*$)/g, "");
	if(feed_back == 'success'){
		change_error_style(obj,"remove");
		change_tip(obj,null,"remove");
		return true;
	}else{
		change_error_style(obj,"add");
		change_tip(obj,feed_back,"add");
		return false;
	}
}

function change_tip(obj,msg,action_type){
	
	if(obj.attr("tip") == undefined){//初始化判断TIP是否为空
		obj.attr("is_tip_null","yes");
	}
	if(action_type == "add"){
		if(obj.attr("is_tip_null") == "yes"){
			obj.attr("tip",msg);
		}else{
			if(msg != null){
				if(obj.attr("tip_bak") == undefined){
					obj.attr("tip_bak",obj.attr("tip"));
				}
				obj.attr("tip",msg);
			}
		}
	}else{
		if(obj.attr("is_tip_null") == "yes"){
			obj.removeAttr("tip");
			obj.removeAttr("tip_bak");
		}else{
			obj.attr("tip",obj.attr("tip_bak"));
			obj.removeAttr("tip_bak");
		}
	}
}

function change_error_style(obj,action_type){
	if(action_type == "add"){
		obj.addClass("input_validation-failed");
	}else{
		obj.removeClass("input_validation-failed");
	}
}

$.fn.validate_callback = function(msg,action_type){
	this.each(function(){
		if(action_type == "failed"){
			change_error_style($(this),"add");
			change_tip($(this),msg,"add");
		}else{
			change_error_style($(this),"remove");
			change_tip($(this),null,"remove");
		}
	});
}
	//如果要试用扩展表单验证的话，该属性一定要申明
function  extendsValidate(){	//函数名称，固定写法
	//密码匹配验证
	var newpsd=$("#userPassword_id").val();
	var rpsd=$("#userPasswordRepeat_id").val();
	if($.trim(newpsd)!=""&&$.trim(rpsd)!=""&&newpsd==rpsd){//匹配成功
		$("#userPassword_id").validate_callback(null,"sucess");
		$("#userPasswordRepeat_id").validate_callback(null,"sucess");
		return true;
	//此次是官方提供的，用来消除以前错误的提示
	}else if($.trim(newpsd)==""&&$.trim(rpsd)==""){//匹配失败
		$("#userPasswordRepeat_id").validate_callback("密码不能为空！","failed");	
		$("#userPassword_id").validate_callback("密码不能为空！","failed");	
		return false;
	}else{
		$("#userPasswordRepeat_id").validate_callback("两次密码不一致！","failed");	
		$("#userPassword_id").validate_callback("两次密码不一致！","failed");	
		return false;
	}
}