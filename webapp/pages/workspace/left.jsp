<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<script type="text/javascript">
		$.fn.rsAccordion = function(options) {
			var opt = $.extend( {
				toggleCln : "lshowcur", //切换显示的样式名
				level_1 : ".sal", //第一层的选择器
				level_1_title : "dt", //第一层的标签头
				level_1_data : "dd" //第一层的标签内容
			}, options);
			var _self = $(this);
			var _levels = _self.children(opt.level_1);
			_self.on("click", opt.level_1_title, function(e) {
				var _this = $(this);
				var _paret = _this.parent();
				var _isShow = _levels.filter(".lshowcur");
				if (_isShow[0] != _paret[0]) {
					_isShow.removeClass(opt.toggleCln);
					_paret.addClass(opt.toggleCln);
				} else {
					_paret.removeClass(opt.toggleCln);
				}
			});
			return this;
		};
		$(function() {
			$('.Topnav em').click(function() {
				$('.navText,.operatLmenu').toggleClass('hide');
			});
			$('.operatLmenu p').click(function() {
				$('.sal dd p').removeClass('cur');
				$(this).addClass('cur').siblings().removeClass('cur');
			});
			$(".operatLmenu").rsAccordion();
			lmenuSubhei();
		});
		function lmenuSubhei(){
			var MeHi = $(window).height();
			//alert($('.sal dd').length);
			$('.sal dd').css('height', Math.round(MeHi - 137-($('.sal dd').length*38)) + 'px');
			//$('.menuside').css('height', Math.round(MeHi - 150) + 'px');
		}
		window.onresize = function () {
			lmenuSubhei();
		}
    </script>
	</head>
	<body>
		<div class="leftSide">
			<div class="Topnav" style="text-align:center">
				<span class="navText">导航菜单</span>
			</div>
			<div class="menuside">
				<div class="operatLmenu">
				   <s:iterator value="topMenuList" status="topMenuListIndex" id="topMenu">
						<dl class="sal">
							<dt>
								<span class="sawt">
								    <s:property value="#topMenu.name" />
                                </span>
							</dt>
							<s:iterator value="topChildMenuList" status="topChildMenuListIndex" id="topChildMenu">
								<s:if test="#topChildMenu.key == #topMenu.menuid">
								    <dd>
								        <s:iterator value="#topChildMenu.value"	id="topChildMenuValue">
											<p>
												<a href="javascript:void(0)" 
												   onclick='showTab("<s:property value='#topChildMenuValue.menuid'/>","<s:url value='%{url}' includeParams='none'/>","<s:property value='#topChildMenuValue.name'/>");'>
												   <s:property value="#topChildMenuValue.name" />
												</a>
											</p>
										</s:iterator>
								    </dd>
								</s:if>
							</s:iterator>
						</dl>
					</s:iterator>
				</div>
			</div>
		</div>
		
	</body>
</html>