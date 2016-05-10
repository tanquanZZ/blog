var BlogIndex = BlogIndex || {};

/**
 * 初始化页面控件
 */
BlogIndex.init = function () {
	
	$("[data-toggle='tooltip']").tooltip();
	$("#blog_classify").popover({
		trigger : "focus",
		html : true,
		content : BlogIndex.getClassifyContent
	});
	$("#nav_tool_container > a").click(function () {
		var $this = $(this);
		$this.addClass("active");
		$this.siblings().removeClass("active");
	});
	
}

BlogIndex.getClassifyContent = function () {
	return "show me please!"
}

$(function () { 
	BlogIndex.init();
});
