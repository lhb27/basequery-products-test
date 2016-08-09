var tabCurDataId ;//当前标签页的dataId
$(function(){
	/**初使化一级菜单**/
	$(".dropdown-menu > li[data-id]").each(function(i,ele){
		var $that=$(this);
		$(this).find(".menu-temp a").each(function(i,n){
			$(this).attr("data-id",$that.attr("data-id")+"_"+(i+1));
		});
	}).on("click",function(){
		$(this).addClass("cur").siblings().removeClass("cur");
		$(".sidebar-menu").html($(this).find(".menu-temp").html());
		return false;
	}).eq(0).trigger("click");
	
	$(".first-level-menu > li[data-id]").on("click",function(){
		$(".dropdown-menu > li[data-id='"+$(this).attr("data-id")+"']").click();
		$(this).addClass("cur").siblings().removeClass("cur");
	});
	
	/**页卡菜单**/
	//页卡滚动
	$(".page-tabs").sunny_scroll({scrollTime:200});
	$(".page-left-btn").click(function(){
		$(".page-tabs .tabs_btn_left").click();
	});
	$(".page-right-btn").click(function(){
		$(".page-tabs .tabs_btn_right").click();
	});
	
	//页卡
	$(".page-tabs").on("click","li",function(){//点击页卡
		var dataId=$(this).attr("data-id");
		var $tab=$(".page-tabs li[data-id='"+dataId+"']");
		var $sidebarTab=$(".sidebar-menu a[data-id='"+dataId+"']");
		var $treeview=$sidebarTab.closest(".treeview");
		tabCurDataId = dataId;
		
		$(".sidebar-menu > li li").removeClass("active")
		.has("a[data-id='"+dataId+"']").addClass("active");
		
		if(!$tab.hasClass("cur")){
		  $(".page[data-id='"+dataId+"']").show().siblings(".page").hide();
		  if(dataId!="0"){
			$tab.addClass("cur");
		  }
		  $tab.siblings().removeClass("cur");
		}
		return false;
	}).on("click",".fa-close",function(event){//关闭页卡
		var $parent=$(this).closest("li");
		var dataId=$parent.attr("data-id");
		var $tab=$(".page-tabs li[data-id='"+dataId+"']");

		if($parent.hasClass("cur")){
			var $tmp=null;
			var $relContent=$(".page[data-id='"+dataId+"']");
			$relContent.hide();
			if($parent.prev().attr('data-id')!="0"){
				$tmp=$parent.prev().addClass("cur");
				$relContent.prev().show().end().remove();
			}
			else{
				if($parent.next().length>0){
					$tmp=$parent.next().addClass("cur");
					$relContent.next().show().end().remove();
				}
				else{
					$relContent.prev().show().end().remove();
				}
			}
			if($tmp!=null){
				$(".sidebar-menu > li li")
				.has("a[data-id='"+$tmp.attr('data-id')+"']").addClass("active");
			}
		}
		else{
			$(".page[data-id='"+dataId+"']").remove();
		}
		$parent.remove();
		$(".sidebar-menu > li li")
		.has("a[data-id='"+dataId+"']").removeClass("active");

		$(".page-tabs").trigger("tabScroll.refresh");//刷新分页选项卡

		return false;
	});
	//关闭所有页卡
	$(".close-all-tabs").click(function(){
		$(".page-tabs li").filter(function(index){
			return !$(this).hasClass("home-tab");
		}).remove();
		$(".content-wrapper > .page[data-id!='0']").remove();
		$(".page[data-id='0']").show();
		$(".sidebar-menu > li li").removeClass("active");
		$(".page-tabs").trigger("tabScroll.refresh");//刷新分页选项卡
	});
	//关闭其它页卡
	$(".close-other-tabs").click(function(){
		var index=$(".page-tabs li.cur").attr("data-id");
		$(".page-tabs li").filter(function(index){
			return !($(this).hasClass("home-tab")||$(this).hasClass("cur"));
		}).remove();
		$(".content-wrapper > .page[data-id!='0'][data-id!='"+index+"']").remove();
		$(".page-tabs").trigger("tabScroll.refresh");//刷新分页选项卡
	});
	
	/**侧边菜单**/
	$(document).on("click",".sidebar-menu a",function(event){
		if($(this).attr("href")=="#"){
			return false;
		}
		var domThis=this;
		var domId=$(domThis).attr("data-id");
		var $parentLi=$(domThis).closest("li");
		var $sidebarList=$(".sidebar-menu > li");
		var $contentWrapper=$(".content-wrapper");
		var $container=$(".page[data-id='"+domId+"']");
		tabCurDataId = domId;
		
		var $loading=$contentWrapper.children(".overlay-wrapper");
		
		$("li",$sidebarList).removeClass("active");
		$parentLi.addClass("active");

		$sidebarList.filter(function(){
			return $(this).children("a").attr("href")!="#";
		}).not($parentLi.get(0)).removeClass("active");
		
		if($loading.length<=0){
			$loading=$('<div class="overlay-wrapper loading"><div class="overlay"><i class="fa fa-refresh fa-spin" style="top:200px !important"></i></div></div>');
			$contentWrapper.prepend($loading);
		}

		$loading.show();
		
		$(".page-tabs li").removeClass("cur");
		if($container.length<=0){//如果该标签页没加载过，就加载
			$container=$('<div class="page"></div>').attr("data-id",domId);
			$contentWrapper.append($container);
			$(".page-tabs ul").append('<li class="cur" data-id="'+domId+'"><a href="#"><span>'+$(domThis).text()+'</span><i class="fa fa-fw fa-close" title="\u5173\u95ed"></i></a></li>')
		}

		$container.html("");//清空iframe
		var iframe = document.createElement("iframe");
		iframe.scrolling="auto";
		iframe.id ="mainiframe";
		iframe.src = domThis.href;
		
		$container.append(iframe);
		iframe.onload = function(){
			$(iframe).animate({
				height:iframe.contentDocument.body.offsetHeight
			});
			$loading.hide();
		};

		$('.page-tabs li[data-id="'+domId+'"]').addClass("cur");
		$contentWrapper.children(".page").hide();
		$container.show();

		$(".page-tabs").trigger("tabScroll.refresh");//刷新分页选项卡
		//setTopLevelMenuWidth();//页的高度设置
		
		return false;
	});
	
	/* 顶级菜单与每一页的高度重设 */ 
	function setTopLevelMenuWidth(){
		var $firstMenu=$(".first-level-menu");
		setTimeout(function(){
			$(".page").height($(window).height()-parseInt($(".content-wrapper").css("padding-top")));
			$firstMenu.css("max-width",$(".navbar").outerWidth()-$(".sidebar-toggle").outerWidth()-$(".operion-more-menu").outerWidth()-$(".messages-menu").outerWidth()-$(".notifications-menu").outerWidth()-$(".tasks-menu").outerWidth()-$(".user-menu").outerWidth()-20);
		},350);
	}
	/**其它**/
	$(window).on('resize load',function(){
		$(".page-tabs").trigger("tabScroll.refresh");
		setTopLevelMenuWidth();
	})

	//兼容标题页的滚动效果
	$(".sidebar-toggle").click(function(e){
		$("body").toggleClass("sidebar-oper")
		$(".page-tabs").trigger("tabScroll.refresh");
		setTopLevelMenuWidth();
	})
	$("body").on("mouseenter mouseleave",".main-sidebar",function(){
		if($("body").hasClass("sidebar-oper")){
			$(".first-level-menu").css("max-width",160)
			setTopLevelMenuWidth();
		}		
	})
});
function setIframeHeight(h){
	$(".page[data-id='"+tabCurDataId+"']").find("iframe").animate({
		height:h+50
	});
	//$(".page[data-id='"+tabCurDataId+"']").find("iframe").height(h+50);
}
