
$(function(){
    
    // 判断整数value是否大于0
    jQuery.validator.addMethod("isIntGtZero", function(value, element) {
    	var flag = false;
    	if(/^\d+$/.test(value)){
    		flag = true;
    	}else{
    		return flag;
    	}
         value=parseInt(value);      
         return this.optional(element) || value>0;       
    }, "整数必须大于0"); 
      
    // 判断整数value是否大于或等于0
    jQuery.validator.addMethod("isIntGteZero", function(value, element) { 
    	var flag = false;
    	if(/^\d+$/.test(value)){
    		flag = true;
    	}else{
    		return flag;
    	}
         value=parseInt(value);      
         return this.optional(element) || value>=0;       
    }, "必须为整数"); 

    // 判断整数value是否不等于0 
    jQuery.validator.addMethod("isIntNEqZero", function(value, element) { 
         value=parseInt(value);      
         return this.optional(element) || value!=0;       
    }, "整数必须不等于0");  
    
    // 判断整数value是否小于0 
    jQuery.validator.addMethod("isIntLtZero", function(value, element) { 
         value=parseInt(value);      
         return this.optional(element) || value<0;       
    }, "整数必须小于0");  
    
    // 判断整数value是否小于或等于0 
    jQuery.validator.addMethod("isIntLteZero", function(value, element) { 
         value=parseInt(value);      
         return this.optional(element) || value<=0;       
    }, "整数必须小于或等于0");  
    
    // 判断浮点数value是否等于0 
    jQuery.validator.addMethod("isFloatEqZero", function(value, element) { 
         value=parseFloat(value);      
         return this.optional(element) || value==0;       
    }, "浮点数必须为0"); 
      
    // 判断浮点数value是否大于0
    jQuery.validator.addMethod("isFloatGtZero", function(value, element) { 
         value=parseFloat(value);      
         return this.optional(element) || value>0;       
    }, "浮点数必须大于0"); 
      
    // 判断浮点数value是否大于或等于0
    jQuery.validator.addMethod("isFloatGteZero", function(value, element) { 
         value=parseFloat(value);      
         return this.optional(element) || value>=0;       
    }, "浮点数必须大于或等于0");   
    
    // 判断浮点数value是否不等于0 
    jQuery.validator.addMethod("isFloatNEqZero", function(value, element) { 
         value=parseFloat(value);      
         return this.optional(element) || value!=0;       
    }, "浮点数必须不等于0");  
    
    // 判断浮点数value是否小于0 
    jQuery.validator.addMethod("isFloatLtZero", function(value, element) { 
         value=parseFloat(value);      
         return this.optional(element) || value<0;       
    }, "浮点数必须小于0");  
    
    // 判断浮点数value是否小于或等于0 
    jQuery.validator.addMethod("isFloatLteZero", function(value, element) { 
         value=parseFloat(value);      
         return this.optional(element) || value<=0;       
    }, "浮点数必须小于或等于0");  
    
    // 判断浮点型  
    jQuery.validator.addMethod("isFloat", function(value, element) {       
         return this.optional(element) || /^[-\+]?\d+(\.\d+)?$/.test(value);       
    }, "只能包含数字、小数点等字符"); 
     
    // 匹配integer
    jQuery.validator.addMethod("isInteger", function(value, element) {       
         return this.optional(element) || (/^[-\+]?\d+$/.test(value) && parseInt(value)>=0);       
    }, "匹配integer");  
     
    // 判断数值类型，包括整数和浮点数
    jQuery.validator.addMethod("isNumber", function(value, element) {       
        return this.optional(element) ||/^([1-9][\d]{0,7}|0)(\.[\d]{1,2})?$/.test(value);
    }, "请填写正确的金额"); 

    // 判断数值类型，包括整数和浮点数(不包含0)
    jQuery.validator.addMethod("isNumberNotZero", function(value, element) {
    	var flag=true;
    	value=value.replace(/(^\s*)|(\s*$)/g,"");
    	if(value=="0"||value=="0.0"||value=="0.00"){
    		flag=false;
    	}
    	return flag;
    }, "金额不能为0");

    // 只能输入[0-9]数字
    jQuery.validator.addMethod("isDigits", function(value, element) {       
         return this.optional(element) || /^\d+$/.test(value);       
    }, "只能输入0-9数字");  
    
    // 判断中文字符 
    jQuery.validator.addMethod("isChinese", function(value, element) {       
         return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);       
    }, "只能包含中文字符。");   
 
    // 判断英文字符 
    jQuery.validator.addMethod("isEnglish", function(value, element) {       
         return this.optional(element) || /^[A-Za-z]+$/.test(value);       
    }, "只能包含英文字符。");   
 
    jQuery.validator.addMethod("isMobile", function(value, element) {
		  var length = value.length;
		  var mobile = /^(((1[0-9]{1})|(1[0-9]{1}))+\d{9})$/;
		  return this.optional(element) || (length == 11 && mobile.test(value));
		 }, "请正确填写您的手机号码");

    // 电话号码验证    
    jQuery.validator.addMethod("isPhone", function(value, element) {    
      var tel = /^(\d{3,4}-?)?\d{7,9}$/g;    
      return this.optional(element) || (tel.test(value));    
    }, "请正确填写您的电话号码。");
    
    // 联系电话(手机/电话皆可)验证   
    jQuery.validator.addMethod("isTel", function(value,element) {   
        var length = value.length;   
        var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;   
        var tel = /^(\d{3,4}-?)?\d{7,9}$/g;       
        return this.optional(element) || tel.test(value) || (length==11 && mobile.test(value));   
    }, "请正确填写您的联系方式"); 
 
     // 匹配qq      
    jQuery.validator.addMethod("isQq", function(value, element) {       
         return this.optional(element) || /^[1-9]\d{4,12}$/;       
    }, "匹配QQ");   
 
     // 邮政编码验证    
    jQuery.validator.addMethod("isZipCode", function(value, element) {    
      var zip = /^[0-9]{6}$/;    
      return this.optional(element) || (zip.test(value));    
    }, "请正确填写您的邮政编码。");  
    
    // 匹配密码，以字母开头，
    jQuery.validator.addMethod("isPwd", function(value, element) {       
         return this.optional(element) || /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]*$/.test(value);       
    }, "密码必须是字母数字的组合");  
    // 匹配密码，密码长度8-16
    jQuery.validator.addMethod("isPwdLen", function(value, element) {
         return this.optional(element) || (value.length>=8&&value.length<=20);       
    }, "密码长度必须在8~20位之间");  
    //验证原始密码是否正确
    jQuery.validator.addMethod("isPwdExist", function(value, element) {
    	//长度6<value<16  不成立  提示原始密码错误  ,成立ajax校验密码是否正确
    	var zhengze=/^[a-zA-Z0-9]{6,16}$/;
        return this.optional(element) || zhengze.test(value);       
   }, "原始密码格式不正确"); 
    //验证两次新密码是否一致
    jQuery.validator.addMethod("isRepetition", function(value, element) {
    	var pwd1=document.getElementById("newPwd").value.replace(/(^\s*)|(\s*$)/g,"");
        return this.optional(element) || pwd1==value.replace(/(^\s*)|(\s*$)/g,"");       
   }, "两次新密码输入不一致");  
    
    
    // 身份证号码验证
    jQuery.validator.addMethod("isIdCardNo", function(value, element) { 
      //var idCard = /^(\d{6})()?(\d{4})(\d{2})(\d{2})(\d{3})(\w)$/;   
      return this.optional(element) || isIdCardNo(value);    
    }, "请输入正确的身份证号码。"); 
    
    //银行卡号luhm验证
    jQuery.validator.addMethod("luhmCheck", function(value, element) { 
      return this.optional(element) || luhmCheck(value);    
    }, "请输入正确的银行卡号。"); 

    // IP地址验证   
    jQuery.validator.addMethod("ip", function(value, element) {    
      return this.optional(element) || /^(([1-9]|([1-9]\d)|(1\d\d)|(2([0-4]\d|5[0-5])))\.)(([1-9]|([1-9]\d)|(1\d\d)|(2([0-4]\d|5[0-5])))\.){2}([1-9]|([1-9]\d)|(1\d\d)|(2([0-4]\d|5[0-5])))$/.test(value);    
    }, "请填写正确的IP地址。");
   
    // 字符验证，只能包含中文、英文、数字、下划线等字符。    
    jQuery.validator.addMethod("stringCheck", function(value, element) {       
         return this.optional(element) || /^[a-zA-Z0-9\u4e00-\u9fa5-_]+$/.test(value);       
    }, "只能包含中文、英文、数字、下划线等字符");   
   
    // 字符验证，只能包含中文、英文。    
    jQuery.validator.addMethod("chineseOrenglish", function(value, element) {       
         return this.optional(element) || /^[a-zA-Z\u4e00-\u9fa5-]+$/.test(value);       
    }, "只能为汉字或字母");  
    
    // 匹配english  
    jQuery.validator.addMethod("isEnglish", function(value, element) {       
         return this.optional(element) || /^[A-Za-z]+$/.test(value);       
    }, "匹配english");   
    
    // 匹配汉字  
    jQuery.validator.addMethod("isChinese", function(value, element) {       
         return this.optional(element) || /^[\u4e00-\u9fa5]+$/.test(value);       
    }, "匹配汉字");   
    
    // 匹配中文(包括汉字和字符) 
    jQuery.validator.addMethod("isChineseChar", function(value, element) {       
         return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);       
    }, "匹配中文(包括汉字和字符) "); 
      
    // 判断是否为合法字符(a-zA-Z0-9-_)
    jQuery.validator.addMethod("isNumOrEnglish", function(value, element) {       
    	return this.optional(element) || /^[A-Za-z0-9]+$/.test(value);       
    }, "请使用字母和数字");   
    
    // 判断是否为合法字符(a-zA-Z0-9-_)
    jQuery.validator.addMethod("isRightfulString", function(value, element) {       
         return this.optional(element) || /^[A-Za-z0-9_-]+$/.test(value);       
    }, "判断是否为合法字符(a-zA-Z0-9-_)");   
    
    // 判断是否包含中英文特殊字符，除英文"-_"字符外
    jQuery.validator.addMethod("isContainsSpecialChar", function(value, element) {  
         var reg = RegExp(/[(\ )(\`)(\~)(\!)(\@)(\#)(\$)(\%)(\^)(\&)(\*)(\()(\))(\+)(\=)(\|)(\{)(\})(\')(\:)(\;)(\')(',)(\[)(\])(\.)(\<)(\>)(\/)(\?)(\~)(\！)(\@)(\#)(\￥)(\%)(\…)(\&)(\*)(\（)(\）)(\—)(\+)(\|)(\{)(\})(\【)(\】)(\‘)(\；)(\：)(\”)(\“)(\’)(\。)(\，)(\、)(\？)]+/);   
         return this.optional(element) || !reg.test(value);       
    }, "含有中英文特殊字符");
    
    
    
    //异步验证登陆密码
    jQuery.validator.addMethod("checkLoginPwd", function(value, element){
        var result = false;
        // 设置同步
        $.ajaxSetup({
            async: false
        });
        var param = {
        	oldPwd: $.base64.btoa(value,true)
        };
        $.post(ctx+"/user/checkPwd", param, function(data){
        	var json=JSON.parse(data);
            result = ("true" == json.isCheck);
        });
        // 恢复异步
        $.ajaxSetup({
            async: true
        });
        return result;
    }, "旧密码错误");
    
    //异步验证登陆密码
    jQuery.validator.addMethod("checkPayPwd", function(value, element){
        var result = false;
        // 设置同步
        $.ajaxSetup({
            async: false
        });
        var param = {
        	oldPwd: $.base64.btoa(value,true)
        };
        $.post(ctx+"/user/checkPayPwd", param, function(data){
        	var json=JSON.parse(data);
            result = ("true" == json.isCheck);
        });
        // 恢复异步
        $.ajaxSetup({
            async: true
        });
        return result;
    }, "旧支付密码错误");
    
    //验证新密码
    jQuery.validator.addMethod("checkConfirmPwd", function(value, element){
    	var oldPwd =  document.getElementById("oldPwd").value;
        return oldPwd != value;
    }, "新密码与旧密码相同");
    
    //验证确认密码
    jQuery.validator.addMethod("checkNewPwd", function(value, element){
    	var newPwd =  document.getElementById("newPwd").value;
    	return newPwd == value;
    }, "确认密码与新密码不一致");
    
    
  //验证确认密码
    jQuery.validator.addMethod("confirmLoginPwd", function(value, element){
    	var newPwd =  document.getElementById("pwd1").value;
        return newPwd == value;
    }, "确认密码与登录密码不一致");
    
    //验证退款金额是否超过订单金额
    jQuery.validator.addMethod("checkOrderAmt", function(value, element){
    	var refReqAmt =  document.getElementById("refReqAmt").value;
    	var merorderamt =  document.getElementById("merorderamt").value;
    	refReqAmt = parseFloat(refReqAmt);
    	merorderamt = parseFloat(merorderamt);
    	value = parseFloat(value);
    	value = value * 100;
        return refReqAmt + value <= merorderamt;
    }, "退款申请额超过订单剩余可退款总额");
    
  
    
     //异步验证身份证号码
    jQuery.validator.addMethod("checkCertNo", function(value, element){
    	alert(1);
    	var curWwwPath=window.document.location.href;
    	var pathName=window.document.location.pathname;
    	var pos=curWwwPath.indexOf(pathName);
    	var localhostPaht=curWwwPath.substring(0,pos);
    	var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    	var contextPath=localhostPaht;
    	var indexL = contextPath.indexOf("localhost");
    	if(indexL != -1){
    		contextPath = localhostPaht+projectName;
    	}
        var result = false;
        // 设置同步
        $.ajaxSetup({
            async: false
        });
        var param = {
        	certNo: value
        };
        $.post(contextPath + "/user/checkCertNo.do", param, function(data){
            result = ("true" == data.isCheck);
            
        });
        // 恢复异步
        $.ajaxSetup({
            async: true
        });
        return result;
    }, "该身份证号已被注册");
    
  //异步验证身份证号码(修改信息时)
    jQuery.validator.addMethod("checkCertNoUpd", function(value, element){
    	
    	var cartUpd = $("#certNoUpd").val();
    	if(value == cartUpd){
    		return true;
    	}else{
    		var curWwwPath=window.document.location.href;
        	var pathName=window.document.location.pathname;
        	var pos=curWwwPath.indexOf(pathName);
        	var localhostPaht=curWwwPath.substring(0,pos);
        	var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
        	var contextPath=localhostPaht;
        	var indexL = contextPath.indexOf("localhost");
        	if(indexL != -1){
        		contextPath = localhostPaht+projectName;
        	}
            var result = false;
            // 设置同步
            $.ajaxSetup({
                async: false
            });
            var param = {
            	certNo: value
            };
            $.post(contextPath + "/user/checkCertNo.do", param, function(data){
                result = ("true" == data.isCheck);
                
            });
            // 恢复异步
            $.ajaxSetup({
                async: true
            });
            return result;
    	}
    	
    }, "该身份证号已被注册");
     
  //异步验证用户ID
    jQuery.validator.addMethod("checkUserId", function(value, element){
		var result = false;
		// 设置同步
		$.ajaxSetup({
			async : false
		});
		var param = {
			userId : value
		};
		$.post(ctx + "/user/checkUserId", param, function(data) {
			result = ("true" == data.isCheck);

		});
		// 恢复异步
		$.ajaxSetup({
			async : true
		});
		return result;
    	
    }, "该登录名已存在");
    
    // 验证码
    jQuery.validator.addMethod("checkForGetCode", function(value, element){
    	var curWwwPath=window.document.location.href;
    	var pathName=window.document.location.pathname;
    	var pos=curWwwPath.indexOf(pathName);
    	var localhostPaht=curWwwPath.substring(0,pos);
    	var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    	var contextPath=localhostPaht;
    	var indexL = contextPath.indexOf("localhost");
    	if(indexL != -1){
    		contextPath = localhostPaht+projectName;
    	}
        var result = false;
        // 设置同步
        $.ajaxSetup({
            async: false
        });
        var param = {
        	loginName: $("#loginName").val(),
        	code: value
        };
        $.post(contextPath + "/checkForgetCode", param, function(data){
            result = data.isSucc;
            
        });
        // 恢复异步
        $.ajaxSetup({
            async: true
        });
        return result;
    }, "验证码有误");
    
    
    function isIdCardNo(num) {
    	//if (isNaN(num)) {alert("输入的不是数字！"); return false;}
  	var len = num.length,
  	re;
  	if (len == 15) re = new RegExp(/^(\d{6})()?(\d{2})(\d{2})(\d{2})(\d{2})(\w{1})$/);
  	else if (len == 18) re = new RegExp(/^(\d{6})()?(\d{4})(\d{2})(\d{2})(\d{3})(\w{1})$/);
  	else {
  		//alert("输入的数字位数不对。"); 
  		return false;
  	}
  	var a = num.match(re);
  	if (a != null){
  		if (len == 15){
  			var D = new Date("19" + a[3] + "/" + a[4] + "/" + a[5]);
  			var B = D.getYear() == a[3] && (D.getMonth() + 1) == a[4] && D.getDate() == a[5];
  		}
  	else{
  			var D = new Date(a[3] + "/" + a[4] + "/" + a[5]);
  			var B = D.getFullYear() == a[3] && (D.getMonth() + 1) == a[4] && D.getDate() == a[5];
  		}
  		if (!B) {
  			//alert("输入的身份证号 "+ a[0] +" 里出生日期不对。"); 
  			return false;
  		}
  	}
  	if (!re.test(num)) {
  		//alert("身份证最后一位只能是数字和字母。");
  		return false;
  	}
  	return true;
  }
    
    function luhmCheck(bankno){
		if (bankno.length < 16 || bankno.length > 19) {
			//$("#banknoInfo").html("银行卡号长度必须在16到19之间");
			return false;
		}
		var num = /^\d*$/;  //全数字
		if (!num.exec(bankno)) {
			//$("#banknoInfo").html("银行卡号必须全为数字");
			return false;
		}
		//开头6位
		var strBin="10,18,30,35,37,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,58,60,62,65,68,69,84,87,88,94,95,98,99";    
		if (strBin.indexOf(bankno.substring(0, 2))== -1) {
			//$("#banknoInfo").html("银行卡号开头6位不符合规范");
			return false;
		}
        var lastNum=bankno.substr(bankno.length-1,1);//取出最后一位（与luhm进行比较）
    
        var first15Num=bankno.substr(0,bankno.length-1);//前15或18位
        var newArr=new Array();
        for(var i=first15Num.length-1;i>-1;i--){    //前15或18位倒序存进数组
            newArr.push(first15Num.substr(i,1));
        }
        var arrJiShu=new Array();  //奇数位*2的积 <9
        var arrJiShu2=new Array(); //奇数位*2的积 >9
        
        var arrOuShu=new Array();  //偶数位数组
        for(var j=0;j<newArr.length;j++){
            if((j+1)%2==1){//奇数位
                if(parseInt(newArr[j])*2<9)
                arrJiShu.push(parseInt(newArr[j])*2);
                else
                arrJiShu2.push(parseInt(newArr[j])*2);
            }
            else //偶数位
            arrOuShu.push(newArr[j]);
        }
        
        var jishu_child1=new Array();//奇数位*2 >9 的分割之后的数组个位数
        var jishu_child2=new Array();//奇数位*2 >9 的分割之后的数组十位数
        for(var h=0;h<arrJiShu2.length;h++){
            jishu_child1.push(parseInt(arrJiShu2[h])%10);
            jishu_child2.push(parseInt(arrJiShu2[h])/10);
        }        
        
        var sumJiShu=0; //奇数位*2 < 9 的数组之和
        var sumOuShu=0; //偶数位数组之和
        var sumJiShuChild1=0; //奇数位*2 >9 的分割之后的数组个位数之和
        var sumJiShuChild2=0; //奇数位*2 >9 的分割之后的数组十位数之和
        var sumTotal=0;
        for(var m=0;m<arrJiShu.length;m++){
            sumJiShu=sumJiShu+parseInt(arrJiShu[m]);
        }
        
        for(var n=0;n<arrOuShu.length;n++){
            sumOuShu=sumOuShu+parseInt(arrOuShu[n]);
        }
        
        for(var p=0;p<jishu_child1.length;p++){
            sumJiShuChild1=sumJiShuChild1+parseInt(jishu_child1[p]);
            sumJiShuChild2=sumJiShuChild2+parseInt(jishu_child2[p]);
        }      
        //计算总和
        sumTotal=parseInt(sumJiShu)+parseInt(sumOuShu)+parseInt(sumJiShuChild1)+parseInt(sumJiShuChild2);
        
        //计算Luhm值
        var k= parseInt(sumTotal)%10==0?10:parseInt(sumTotal)%10;        
        var luhm= 10-k;
        
        if(lastNum==luhm){
        //$("#banknoInfo").html("Luhm验证通过");
        return true;
        }
        else{
        //$("#banknoInfo").html("银行卡号必须符合Luhm校验");
        return false;
        }        
    }
});
