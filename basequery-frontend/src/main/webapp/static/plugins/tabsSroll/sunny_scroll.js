/*
*选项卡滚动
*/
(function($){
    $.fn.sunny_scroll = function(options){
        var opt =$.extend({},$.fn.sunny_scroll.defaults,options);
		var $that=this;
        return this.each(function(){
            var container = $(this);
            var _content_list = container.children("ul");
            var _content_list_first = container.children("ul:first");
            var _allLi=null;
            var _lef_btn=$("<div>",{"class":opt.arrow_left}).appendTo(container);
            var _rig_btn=$("<div>",{"class":opt.arrow_right}).appendTo(container);

            var _page=0,//当前页码
                _arrLi,//用于转化数组为"1,1,1"这样的格式
                _arrPage,//用于各分页存放该页的对象索引
                _arrCurrentPageWidth,//用于各分页的实际宽度
                _page_count,//页码总数
                _tmp,
                _totalWith;
            
            function initFunc(){//初始化函数
                _arrLi=new Array();
				_allLi=_content_list_first.children("li:visible");
                _arrPage=new Array();
                _arrCurrentPageWidth=new Array();
                _page_count=0;
                _tmp=0;
                _totalWith=0;

                //分割形成每页
                _allLi.each(function(_j){
                    _tmp+=_allLi.eq(_j).outerWidth(true);
                    if(_tmp<container.width()){
                        _arrLi.push(_j);
                        _arrPage[_page_count]=_arrLi.join();
                    }
                    else{
                        _arrLi=[];
                        _arrLi.push(_j);
                        _arrPage[++_page_count]=_arrLi.join();
                        _tmp=0;//该页统计完毕，恢复初始值0
                        _tmp+=_allLi.eq(_j).outerWidth(true);
                    }
                });
                
                //统计各分页的实际宽度，并存放到arrCurrentPageWidth数组中
                for(_j=0;_j<_arrPage.length;_j++){
                    var _t=[];
					
					try{
						_t=_arrPage[_j].split(",")
					}catch(e){}
					
                    var _tL=0;
                    for(_m=0;_m<_t.length;_m++){
                        _tL+=$(_allLi[_t[_m]]).outerWidth(true);
                    }
                    _totalWith+=_tL;
                    _arrCurrentPageWidth.push(_tL);
                }
                _page_count=_arrPage.length;//获取页码总数
                
                container.hover(
                    function(){
                        if(_page_count>1){
                            if(_page==0){
                                _rig_btn.show();
                                _lef_btn.hide();
                            }
                            else if(_page==_page_count-1){
                                _lef_btn.show();
                                _rig_btn.hide();
                            }
                            else{
                                _lef_btn.show();
                                _rig_btn.show();
                            }
                        }
                    },
                    function(){
                        _lef_btn.hide();
                        _rig_btn.hide();
                    }
                )
            }

            initFunc();

            //上页按钮  
            _lef_btn.click(function(){    //绑定click事件  
                 if( !_content_list.is(":animated") ){    //判断“内容展示区域”是否正在处于动画  
                    if(_page == 0){  //已经到第一个版面了,如果再向前，必须跳转到最后一个版面。  
                        /*_content_list.animate({ left : '-='+(_totalWith-_arrCurrentPageWidth[_page_count-1]) }, opt.scrollTime); 
                        _page=_page_count-1;*/
                        $(this).addClass("tofirst");

                    }
                    
                    else{ 
                        if(_page == _page_count-1){
                            _rig_btn.show().removeClass("tolast");
                        }

                        if(_page-1==0){
                            $(this).addClass("tofirst");
                            
                        }
                        else{
                            $(this).removeClass("tofirst");
                        }
                        
                        _content_list.animate({ left : '+='+_arrCurrentPageWidth[_page-1] }, opt.scrollTime); 
                        _page--;
                    }
                 } 
                 

           }); 
            //下页按钮  
            _rig_btn.click(function(e){    //绑定click事件  
                 
                 if( !_content_list.is(":animated") ){    //判断“内容展示区域”是否正在处于动画  
                      if(_page == _page_count-1){  //已经到最后一个版面了,如果再向后，必须跳转到第一个版面。 
                        /*_content_list.animate({ left : '+='+(_totalWith-_arrCurrentPageWidth[_page_count-1]) }, opt.scrollTime); 
                        _page=0;*/
                        $(this).addClass("tolast");

                      }else{   
                        
                        if(_page == 0){
                            _lef_btn.show().removeClass("tofirst");
                        }

                        if(_page+1==_page_count-1){
                            
                            $(this).addClass("tolast");
                        }
                        else{
                            $(this).removeClass("tolast");
                        }

                        _content_list.animate({ left : '-='+_arrCurrentPageWidth[_page] }, opt.scrollTime);  
                        _page++;
                      }
                 } 
                 
           });
           
           //窗口尺寸改变时，重新初始化
           $(this).bind("tabScroll.refresh",function(){
                if(container.is(":visible")){
					setTimeout(function(){
						initFunc();
						_page=0;
						_rig_btn.removeClass("tolast");
						_content_list.css({ left :0});
					},300)
                    
                }
				//console.log($that.get(0).className+" "+_arrPage.length+"\n");
           })
        });
    }

    $.fn.sunny_scroll.defaults = {
        arrow_left:'tabs_btn_left',//左按钮class名
        arrow_right:'tabs_btn_right',//右按钮class名
		scrollTime:'slow'
    }
})(jQuery);




