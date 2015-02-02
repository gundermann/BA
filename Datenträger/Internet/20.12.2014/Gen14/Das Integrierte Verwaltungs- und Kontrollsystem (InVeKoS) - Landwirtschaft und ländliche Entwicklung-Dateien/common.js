/* TIPIK - COMMON.JS */
/* date: 23 July 2008 */
/* Last update: 1 octobre 2008 */


$(document).ready(function(){

	$('html').addClass('js');
  //$('#nav').toggle();
	

	/* Glossary */
	if ( $('.glossary').length ) {
		
		var $dls = $('#definitions dl'),
			$letters = $('#letters a');
		
		//When a letter is clicked in the letters navigation
		$letters.click(function(e) {

			e.preventDefault();

			$letters.removeClass('on');

			$(this).addClass('on');

			$dls.css('display', 'none');

			$('dl#' + $(this).attr('id').substr(7, 8)).toggle();

		});
		
		$('dd a.internal-link').click(function(e) {
			
			var $elementToGo = $($(this).attr("hash"));

			//Retrieve first letter of the element to go to.
			var firstLetter = jQuery.trim($elementToGo.attr('class'));

			//Hide all definitions
			$dls.css('display', 'none');
			$letters.removeClass('on');
				
			//Display all definitions with the first letter choosen
			$('#letters a#letter_' + firstLetter).addClass('on');
			$('dl#' + firstLetter).toggle();
			
			//Point to the selected definition
			location.hash = $(this).attr("hash");

			return false;
		});

	}

	
	// Init Popup links
    (function () {

        $('img.links-ico-langs').each(function () {

            $(this).next('span').wrap('<span class="wrap-popup-link"></span>');
            $(this).appendTo($(this).next('span.wrap-popup-link'));
            $(this).after('<span class="lang-popup-arrow"></span>');
        });

    } ());

    $('img.links-ico-langs').live('click', function (e) {
        e.preventDefault();
        if ($(this).parent('span').hasClass('active')) {
            $(this).parent('span').removeClass('active');
        } else {
            $('.wrap-popup-link').removeClass('active');
            $(this).parent('span').addClass('active');
        }
        if ($(this).offset().left > 910) {
            $(this).parent('.wrap-popup-link').addClass('near-right-edge');
        }
    });
    
    $('body').click(function (event) {
        var c = event.target.getAttribute("class");
        c = ' ' + c + ' ';
        if (c.indexOf(" " + 'links-popup' + " ") > -1 || c.indexOf(" " + 'links-ico-langs' + " ") > -1 || c.indexOf(" " + 'lang-popup-arrow' + " ") > -1 || c.indexOf(" " + 'wrap-popup-link' + " ") > -1 || c.indexOf(" " + 'alIco' + " ") > -1) {

        } else {
            $('.wrap-popup-link').removeClass('active');
        }
    });
	
	
	$('#menu .expandable a.header').bind('click',function() {
		$li = $(this).parent('li');
		
		if($li.hasClass('on')) {
			$li.removeClass('on');
		} else {
			$('#nav #menu .on').removeClass('on');
			$li.addClass('on');
		}
		
		return false;
	});
	
	if ($('search-results') && window.location.search) {
		
		(function ajaxLoadSearchResults(pContainer, pImageLoading) {
            /* build the query */
            var poststr = "/archives/veritysearch/resultaction.jsp" + window.location.search;

            /* insert the title and the image before executing the request */
            if (document.getElementById(pContainer)) {

                /*document.getElementById(pContainer).innerHTML = '<img src="'+pImageLoading+'" />';*/
                document.getElementById(pContainer).innerHTML = '<img src="../images/ajax-loader.gif" />';
                //alert(pContainer);
                /* call the central javascript function to load the content of the page and paste it into the container */
                load_dynamic_panel_v2(poststr, poststr, pContainer, '', '<!-- End Search Form -->', '<!-- BOTTOM TOOLS SECTION-->', '', 0, false, '');
            }
        })('search-result', '');
        
    }
    
     $('.m-menu').click(function (event) {
      $('#nav').toggle();
   })
   
   /*
    * CHANGE THE "HOME" LINK IN THE 2013 TEMPLATE IN RESPONSIVE VERSION
    */
     var curr_doc_lang = $('html').attr('lang');
     var current_url = location.href;
     var site_subsites = current_url.split('/');
     var filename = site_subsites[site_subsites.length - 1];
     var new_home_url = '';
     if (site_subsites[3] == 'agriculture')
     {
       new_home_url += '/'+site_subsites[3]+'/'+filename;
     }
     else
     {
       new_home_url += '/'+site_subsites[3]+'/'+site_subsites[4]+'/'+filename;
     }
     
 
     
     $('li.m-home a').attr('href',String(new_home_url));
            
    
})

/* Returns the first letter of an hashtag.
 * @Param An url with a hashtag
 */
function getFirstLetter(urlWithHashTag) {
	var hashtag = urlWithHashTag.attr("hash");
	return hashtag.substr(1, 1);
}
	
function addLoadEvent(func) {
  var oldonload = window.onload;
  if (typeof window.onload != 'function') {
    window.onload = func;
  } else {
    window.onload = function() {
      if (oldonload) {
        oldonload();
      }
      func();
    }
  }
}

var OpenFlashPopup_oldopen=null;

function OpenFlashPopup(e, element, elementWidth, elementHeight) {
	// get the coordinates
	var scrollTop = (document.documentElement && document.documentElement.scrollTop) ? document.documentElement.scrollTop : document.body.scrollTop;
  
	var CurrentWidth = document.body.clientWidth;
	var CurrentHeight= document.body.clientHeight + scrollTop;
	
	var el = document.getElementById(element);
	var position_y =0;
	var position_x = 0;
	
	if(elementWidth == null){
		elementWidth = el.clientWidth;}
	if(elementHeight == null){
		elementHeight= el.clientHeight;}
	
	var x = mouse_x;
	var y = mouse_y;
	
	// add ie scroll
	if(browser.isIE) y = y + scrollTop;
	
	if (x != null && y != null) {
		
		// axe X 
		if(x + elementWidth <= CurrentWidth)  
			{position_x = x + 10;}
		else
			{position_x = CurrentWidth - elementWidth - 10;}
		
		// axe Y 
		if(y + elementHeight <= CurrentHeight)
		{	position_y = y + 10;
		}
		else
		{	position_y = CurrentHeight - elementHeight -10 ;
		}
		
		// close previous Flash popup
		CloseFlashPopup();
		 
		el.style.zIndex = "99";
		el.style.position = "absolute";
		el.style.left = position_x+"px";
		el.style.top = position_y+"px";
		
		OpenFlashPopup_oldopen = element;
	}
}
function CloseFlashPopup() {
		
	if(OpenFlashPopup_oldopen){ //close previous element
	 var olderOpen = document.getElementById(OpenFlashPopup_oldopen);
	 olderOpen.style.zIndex = "0";
	 olderOpen.style.position = "absolute";
	 olderOpen.style.left = "-3000px";
	 olderOpen.style.top = "-3000px";
	}
}

function load_dynamic_panel_v2(url, defaultUrl, panelId, substrAfterStartup, substrAfter, substrBefore, substrBeforeStartup, pLastIndexOfBefore, executeScript, pLoadingImg) {
	
	if(location.href.indexOf('wcmcom-ec-europa-eu-wip') == -1) {
		if(window.XMLHttpRequest) var xmlHttpReq = new XMLHttpRequest();
		else if (window.ActiveXObject) var xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");

		xmlHttpReq.onreadystatechange = function set_dynamic_panel() {
			if (xmlHttpReq.readyState == 4) {
				var problem;
				if (xmlHttpReq.status != 200 && xmlHttpReq.status != 304) {
					/* error getting URL */
					problem = true;
					
				} else {
					problem = false;
					/* URL reached, search content */
					var response = xmlHttpReq.responseText;
					
					/* execute a substring-before and substring-after on the response if it's necessary */
					if(substrAfter != '') {
						
						if(substrAfterStartup != ''){
							if(response.indexOf(substrAfterStartup)>=0){
								response = response.substring(response.indexOf(substrAfterStartup), response.length);
							}
						}
						var lIndex = response.indexOf(substrAfter);
						
						if(lIndex>=0){
							response = response.substring(response.indexOf(substrAfter), response.length);
						}
						else {
							substrAfter = substrAfter.replace('&gt;', '>');
							substrAfter = substrAfter.replace('&lt;', '<');
							/*try in another format */
							if(response.indexOf(substrAfter, lIndex)>=0){
								response = response.substring(response.indexOf(substrAfter), response.length);
							}
							else
							{
								response = "";
							}						
						}
					}
					if(substrBefore != '') {
						if(substrBeforeStartup != ''){
							if(response.indexOf(substrBeforeStartup)>=0){
								response = response.substring(0, response.lastIndexOf(substrBeforeStartup));
							}
						}
	
						if(response.indexOf(substrBefore)>=0) {
							if(pLastIndexOfBefore){
								response = response.substring(0, response.lastIndexOf(substrBefore));
							}
							else{
								response = response.substring(0, response.indexOf(substrBefore));
							}
						}
						else {
							substrBefore = substrBefore.replace('&gt;', '>');
							substrBefore = substrBefore.replace('&lt;', '<');
							/*try in another format */
							if(response.indexOf(substrBefore)>=0) {
								response = response.substring(0, response.indexOf(substrBefore));
							}
							else
							{
								response = "";
							}
						}
					}

					var pID = document.getElementById(panelId);
					if(pID) {
						var responseContainer = '<' + pID.tagName.toLowerCase() + ' id="' + panelId + '">';
						if(response.indexOf(responseContainer)!= -1) {
							response = response.replace(responseContainer, '');
							response = response.replace(response.lastIndexOf('</' + pID.tagName.toLowerCase() + '>'), '');
						}
						pID.innerHTML = response;
						
						if(executeScript){
							/*extract javascript*/
							var lFlagScript = '<script language="JavaScript" type="text/javascript">';
							var lIndexScriptTag = response.lastIndexOf(lFlagScript);
							if(lIndexScriptTag >= 0) {
								/* skip variable declaration 'var' for compatibility with Internet Explorer 6 and ajax evaluation script */
								var localscript = response.substring(lIndexScriptTag+lFlagScript.length, response.lastIndexOf('</script>'));
								if(localscript!='')
									global.eval(localscript);
							}
						}
					}
					
				}
				if (problem == true) {
					/* do something with problem*/
					$(panelId).addClassName('dynPanel_notFound')
					/*addClassName(panelId, "dynPanel_notFound");*/
					
					/* try with the default url */
					if(defaultUrl != '')
						return load_dynamic_panel_v2(defaultUrl, '', panelId, substrAfter, substrBefore);
					else
						return true;
					}
				}
			}
		var myRand=parseInt(Math.random()*99999999); // cache buster
		if(url.indexOf("?")>0){
			url= url + "&rand=" + myRand;
		}else{
			url= url + "?rand=" + myRand;
		}
		
		var lhtml = xmlHttpReq.open("GET", url, true);
		xmlHttpReq.setRequestHeader("Cache-Control", "no-cache");
		xmlHttpReq.send(null);
	}
}

function openTheme(url){
	if(url != ''){
		parent.location=url;
		
	}
	if(document.getElementById('sel_theme')){
		document.getElementById('sel_theme').options[0].selected = true;
	}
	if(document.getElementById('sel_country')){
		document.getElementById('sel_country').options[0].selected = true;
	}
}


/* Stop the propagation of the event */
function stopEvent(ev){
	if (document.addEventListener) ev.stopPropagation();
	else if (document.all)	window.event.cancelBubble = true;
}

/* Main menu. */
/* Javascript to hide and to display the second level */
var menu_hidesubtime;
var shownsub;
var hoveritem;

function menu_showsub(sender, id){
	if (menu_hidesubtime) menu_cancelhidesub();
	sub = document.getElementById(id);
	menu_flag=0;
	if (sub.style.display=='block') menu_flag=1;
	menu_delayhidesub(document.getElementById(id).parentNode.parentNode.id);
	
	if(sub) {
		if (menu_flag==1) sub.style.display='none';
		else sub.style.display='block';
//		sub.style.display=(sub.style.display=='block')?'none':'block';
		sub.focus();
		shownsub = sub;
	}
	
	if(sender){
	   
		if(sender.parentNode){
			if(sender.parentNode.className.indexOf('hover')<0) {
				sender.parentNode.className = sender.parentNode.className + ' hover';
				hoveritem = sender;
			}
		}
	}
}

function menu_hidesub(shownsub){
	if (document.getElementById(shownsub)) document.getElementById(shownsub).style.display = 'none';
	
	if(hoveritem){
		if(hoveritem.parentNode.className.indexOf('hover')>=0) {
			hoveritem.parentNode.className = hoveritem.parentNode.className.substring(0, hoveritem.parentNode.className.indexOf('hover'));
		}
	}
}

function menu_delayhidesub(ContainerID) {	
	var ContainerObject = document.getElementById(ContainerID);		
  if (ContainerObject) {
    var lListChild = ContainerObject.childNodes;
    for (var i = 0; i < lListChild.length; i++) {     
			if (lListChild[i].tagName == 'LI' && lListChild[i].parentNode.getAttribute('id') == ContainerObject.id) {				
				for(j=0; j<lListChild[i].childNodes.length;j++) {
					if(lListChild[i].childNodes[j].tagName == 'UL') {
						menu_hidesub(lListChild[i].childNodes[j].id);
					}
				}				
			}
    }
  }	
}

function menu_cancelhidesub() {
	clearTimeout(menu_hidesubtime);
}

/******************************************************************************************************************/
/* SPECIFIC CODE 																								  */
/******************************************************************************************************************/
var shownlangs;

function showlangs(id)	{
	langs = document.getElementById(id+'langs');
	if (shownlangs == langs) hidelangs();
	else	{
		if (shownlangs) hidelangs();

		langs.style.display = 'block';
		langs.focus();
		shownlangs = langs;
		}
	}
	
function hidelangs()	{
	if (shownlangs)	{
		shownlangs.style.display = 'none';
		shownlangs = null;
		}
	}
	
	
/*****************************************************************************************************************************/
/*TOOGLE*/
/************************************************************************************************************************/
jQuery(document).ready( function () {
    // On cache les sous-menus :
    //$("ul.submenu").hide();
    // On s�lectionne tous les items de liste portant la classe "toggleSubMenu"
    // et on remplace l'�l�ment span qu'ils contiennent par un lien :

    // On modifie l'�v�nement "click" sur les liens dans les items de liste
    // qui portent la classe "toggleSubMenu" :
    $("li.toggleSubMenu > a").click( function (e) {
    		//LV - 04/09/09
    		e.preventDefault();
        // Si le sous-menu �tait d�j� ouvert, on le referme :
        if ($(this).next("ul.submenu:visible").length != 0) {
            $(this).next("ul.submenu").slideUp("normal", function () { $(this).parent().removeClass("open") });
        }
        // Si le sous-menu est cach�, on ferme les autres et on l'affiche :
        else {
            $("ul.submenu").slideUp("normal", function () { $(this).parent().removeClass("open") });
            $(this).next("ul.submenu").slideDown("normal", function () { $(this).parent().addClass("open") });
        }
        // On emp�che le navigateur de suivre le lien :
        //return false; remplac� par e.preventDefault();
    });

	
    //$("li.toggleSubMenu:eq(1) > a").click();
	
} ) ;

// LV - 27/04/2009 / RANDOM PICTURES
function randNB(min, max, except) {
	var n = parseInt(Math.random()*1000)%(max-min+1)+min;
	if(in_array(n, except)==true) {
		while(in_array(n, except)==true) n = parseInt(Math.random()*1000)%(max-min+1)+min;
	}
	return n;
} 

function randomPic(nb_files, nMax, containerID, picsPath) {
	var insert = ''; var imgIDs = new Array(); var me = document.getElementById(containerID);
	if(me) {
		for(i=0; i<nMax; i++) {
			var fileNumber = randNB(1, nb_files, imgIDs);
			imgIDs[i] = fileNumber;
			var img = '<img src="' + picsPath + fileNumber + '.jpg" alt="test"/>';
			insert += img;
		}
		me.innerHTML = insert;
	}
}

function in_array(needle, haystack, argStrict) {
	var found = false, key, strict = !!argStrict;
	for(key in haystack) {
		if((strict && haystack[key] === needle) || (!strict && haystack[key] == needle)) {
			found = true;
			break;
		}
	}
	return found;
}

//LV - 18.05.2009 / GLOSSARY
function glossary_getLetterGlossaryID(letterListID, definitionsContainerID) {
	var startPos = location.href.lastIndexOf('#')+1;
	
	if(startPos != 0) {
		var letterID = location.href.substring(startPos, startPos+1);
		glossary_openTab(letterListID, definitionsContainerID, letterID);
		if((location.href.length-startPos)>1) {
			var fullAnchor = location.href.substring(startPos, location.href.length);
			if(fullAnchor.indexOf('_')!=-1) fullAnchor = fullAnchor.substring(2,location.href.length);
			this.location = '#'+fullAnchor;
		}
	} else {
		var dlID = $('#'+letterListID+' ul li a:first').attr('id').substr(7,8);
		glossary_openTab(letterListID, definitionsContainerID, dlID);
	}
}

function glossary_openTab(letterListID, definitionsContainerID, letterID) {
	$('#'+letterListID+' a').removeClass('on');
	$('#'+letterListID+' a#letter_'+letterID).addClass('on');
	$('#'+definitionsContainerID+' DL').css('display','none');
	$('dl#'+letterID).toggle();
}

$(document).ready(function() {
	
});

/*$(document).ready(function() {
	$('a[href*="/agriculture/glossary/"]').click(function() {
		location.href = $(this).attr('href');
		location.reload(); 
	});
});*/
