(function(win, doc) {
	if (!win.console)
		win.console = {};
	if (!win.console.log)
		win.console.log = function() {
		};
	var _aux = {
		"default_lang": "en",
		"supported_langs": "en|fr|de|es|hr|nl|it|ca|cs|da|et|el|lv|lt|hu|bg|mt|pl|pt|ro|sk|sl|fi|sv|ga",
		/*
		 _aux contains functions that are often used.
		 Consider it a sort of library.
		 Consecutive script can call these functions.
		 They are exposed below: win.ec_aux = _aux;
		 */
		getDocLang: function() {
			var off_lang_spec = new RegExp(/(en|fr|de|es|hr|nl|it|ca|cs|da|et|el|lv|lt|hu|bg|mt|pl|pt|ro|sk|sl|fi|sv|ga)/);
			var root = doc.getElementsByTagName('html')[0];
			var lang = root.getAttribute("lang") || false;
			if (lang && String(lang).length == 2) {
				lang = lang.toLowerCase();
				if (lang.match(off_lang_spec)) {
					return lang;
				}
			}

			var metaTags = doc.getElementsByTagName("meta");
			for (var i = 0; i < metaTags.length; i++) {
				if (metaTags[i].httpEquiv == "Content-Language" && String(metaTags[i].content).length == 2) {
					lang = String(metaTags[i].content).toLowerCase();
					if (lang.match(off_lang_spec)) {
						return lang;
					}
				}
			}

			if (lang.match(off_lang_spec)) {
				return lang;
			}

			var current_url = String(win.location).toLowerCase();
			var li = current_url.match(/_(en|fr|de|es|hr|nl|it|ca|cs|da|et|el|lv|lt|hu|bg|mt|pl|pt|ro|sk|sl|fi|sv|ga)\./);
			if (li && typeof li[1] !== "undefined") {
				return String(li[1]);
			}
			return "en";
		},
		getLang: function(method) {
			var off_lang_spec = new RegExp("(" + _aux.supported_langs + ")");
			var lang = "";
			if (method === null || method === "" || method === undefined) {
				//try automatic language detection
				lang = _aux.getLangAutodetect();
			}
			else if (method === "http-equiv" || method === "meta-language") {
				lang = _aux.getLangFromMeta(method);
			}
			else if (method === "html-lang") {
				lang = _aux.getLangFromHtml();
			}
			else if (method === "url") {
				lang = _aux.getLangFromURL();
			} else {
				//use language passed as parameter
				lang = method;
			}
			//check if language is a valid eu language
			if (!lang.match(off_lang_spec)) {
				lang = _aux.default_lang;
			}
			return lang;
		},
		getLangAutodetect: function() {
			var off_lang_spec = new RegExp("(" + _aux.supported_langs + ")");
			var lang = _aux.getLangFromURL;
			if (String(lang).length !== 2)
				lang = _aux.getLangFromHtml();
			if (String(lang).length !== 2)
				lang = _aux.getLangFromMeta("http-equiv");
			if (String(lang).length !== 2)
				lang = _aux.getLangFromMeta("meta-language");
			if (String(lang).length !== 2)
				lang = _aux.getLangFromMeta("");
			if (String(lang).length !== 2 || !lang.match(off_lang_spec)) {
				lang = _aux.default_lang;
			}

			return lang;
		},
		getLangFromHtml: function() {
			var root = doc.getElementsByTagName("html")[0];
			var lang = root.getAttribute("lang") || false;
			return lang;
		},
		getLangFromURL: function() {
			var current_url = String(win.location).toLowerCase();
			var li = current_url.match("_(" + _aux.supported_langs + ")\.");
			if (li && typeof li[1] !== "undefined") {
				return String(li[1]);
			}
			return false;
		},
		getLangFromMeta: function(type) {
			var metaTags = doc.getElementsByTagName("meta");
			for (var i = 0; i < metaTags.length; i++) {
				if (type === "http-equiv") {
					if (metaTags[i].httpEquiv.toLowerCase() === "content-language" && metaTags[i].content) {
						return metaTags[i].content.substring(0, 2).toLowerCase();
					}
				}
				else if (type === "meta-language" || true) {
					if (metaTags[i].name.toLowerCase() === "language" && metaTags[i].content) {
						return metaTags[i].content.substring(0, 2).toLowerCase();
					}
				}
			}
			return false;
		},
		getMetaValue: function(propertyName) {
			var t_nodes = document.getElementsByTagName("meta");
			var t_attributes;
			var returnValue = '';
			var att_name;
			var att_value;
			for (var i = 0; i < t_nodes.length; i++) {
				if (1 == t_nodes[i].nodeType) {
					t_attributes = t_nodes[i].attributes;
					att_name = '';
					att_value = '';
					for (var j = 0; j < t_attributes.length; j++) {
						if ('' != t_attributes[j].value && ('name' == t_attributes[j].name || 'http-equiv' == t_attributes[j].name))
							att_name = t_attributes[j].value;
						else if ('content' == t_attributes[j].name)
							att_value = t_attributes[j].value;
					}
					if (att_name.toLowerCase() == propertyName.toLowerCase()) {
						returnValue = att_value;
						break;
					}
				}
			}
			return returnValue.toLowerCase();
		},
		isMobile: function() {
			var k = ["midp", "240x320", "160x160", "bolt", "blackberry", "netfront", "nokia", "panasonic", "portalmmm", "sharp", "sie-", "sonyericsson", "symbian", "windows ce", "benq", "mda", "mot-", "opera mini", "philips", "pocket pc", "sagem", "samsung", "sda", "sgh-", "vodafone", "xda", "palm", "iphone", "ipod", "ipad", "android"], u = navigator.userAgent.toLowerCase(), m = false;
			for (var i = 0, l = k.length; i < l; i += 1) {
				if (u.indexOf(k[i]) != -1) {
					m = true;
					break;
				}
			}
			return m;
		},
		inArray: function(needle, haystack) {
			var i = -1;
			for (var key in haystack) {
				i++;
				if (haystack[key] == needle) {
					return i
				}
			}
			return false;
		},
		getCookie		: function(n){var i,l,x,y,a=document.cookie.split(";");for(i=0,l=a.length;i<l;i++){x=a[i].substr(0,a[i].indexOf("="));y=a[i].substr(a[i].indexOf("=")+1);x=x.replace(/^\s+|\s+$/g,"");if(x==n){return unescape(y);}};return false;},
		setCookie		: function(n,v,d){
			var h=win.location.host,e=new Date();;
			h=(h.match(/europa\.eu/))?".europa.eu":null;
			e.setDate(e.getDate()+d);
			var f=escape(v)+"; path=/"+((h==null)?"":"; domain="+h)+((d==null)?"":"; expires="+e.toUTCString());
			document.cookie=n+"="+f;
		},
		cookiesEnabled	: function(){
			if(_aux.getCookie("WRshowSurvey")){return true};var c=(navigator.cookieEnabled)?true:false;if(typeof navigator.cookieEnabled=="undefined"&&!c){_aux.setCookie("cookiesenabled","1");c=(document.cookie.indexOf("cookiesenabled")!=-1)?true:false;};return c;
		},
		inIframe		: function() {
			try {
				if (window.self !== window.top) return true;
				return false;
			} catch (e) {
				return true;
			}
		}
	};
	var _wrs = {
		init: function() {
			_wrs.exposed.doc.lang = _aux.getLang() || "en";
			if (doc.addEventListener) {
				doc.addEventListener("DOMContentLoaded", _wrs.renderPopup, false);
			} else if (doc.attachEvent) {
				doc.attachEvent("onreadystatechange", function() {
					if (/loaded|complete/.test(doc.readyState))
						_wrs.renderPopup();
				});
			}
		},
		survey_links:	{
			"en":"https://www.surveymonkey.com/s/W96YDQL-EC-TT-2014-EN",
			"fr":"https://www.surveymonkey.com/s/WKZ29G2-EC-TT-2014-FR",
			"de":"https://www.surveymonkey.com/s/Q5NNHHF-EC-TT-2014-DE",
			"es":"https://www.surveymonkey.com/s/WK2PFPS-EC-TT-2014-ES",
			"ca":"https://www.surveymonkey.com/s/WK2PFPS-EC-TT-2014-ES",
			"hr":"https://www.surveymonkey.com/s/W8QFPZ2-EC-TT-2014-HR",
			"nl":"https://nl.surveymonkey.com/s/WLGLWJD-EC-TT-2014-NL",
			"it":"https://www.surveymonkey.com/s/W8PN7WV-EC-TT-2014-IT",
			"cs":"https://www.surveymonkey.com/s/Q5K2RMR-EC-TT-2014-CS",
			"da":"https://www.surveymonkey.com/s/Q52GTFC-EC-TT-2014-DA",
			"et":"https://www.surveymonkey.com/s/WKSHCZN-EC-TT-2014-ET",
			"el":"https://www.surveymonkey.com/s/Q55VPZR-EC-TT-2014-EL",
			"lv":"https://www.surveymonkey.com/s/WLYCB3W-EC-TT-2014-LV",
			"lt":"https://www.surveymonkey.com/s/WLL3VV8-EC-TT-2014-LT",
			"hu":"https://www.surveymonkey.com/s/W8XW67W-EC-TT-2014-HU",
			"bg":"https://www.surveymonkey.com/s/QZMCLS8-EC-TT-2014-BG",
			"mt":"https://www.surveymonkey.com/s/WLWWZ8K-EC-TT-2014-MT",
			"pl":"https://www.surveymonkey.com/s/WVSHP82-EC-TT-2014-PL",
			"pt":"https://www.surveymonkey.com/s/WVVS79G-EC-TT-2014-PO",
			"ro":"https://www.surveymonkey.com/s/W78K33X-EC-TT-2014-RO",
			"sk":"https://www.surveymonkey.com/s/W795JBB-EC-TT-2014-SK",
			"sl":"https://www.surveymonkey.com/s/W7SN8GN-EC-TT-2014-SL",
			"fi":"https://www.surveymonkey.com/s/WKGKXDC-EC-TT-2014-FI",
			"sv":"https://www.surveymonkey.com/s/W7HTCZK-EC-TT-2014-SV",
			"ga":"https://www.surveymonkey.com/s/W87RXNX-EC-TT-2014-GA"
		},
		renderPopupDiv: function(html) {
			var popup_div = document.getElementById("wr_overlay");
			popup_div.innerHTML = html;
		},
		renderPopup: function() {
			// don't continue if the page is loaded in an iFrame
			if (_aux.inIframe()) return true;
		
			var prod = false;
			if (!prod) {
				var winloc = window.location.toString();
				if (winloc.match(/wr_survey_test/g)) {
				} else {
					return true;
				}
			}
		
			var element_wr_overlay =  document.getElementById('wr_overlay');
			if (typeof(element_wr_overlay) != 'undefined' && element_wr_overlay != null) {
				return true;
			}
			if (!_aux.cookiesEnabled()) return true;
			var goAhead = _aux.getCookie("WRshowSurvey"); 
			if (goAhead === "0") return true;
		
			// add css
			css = document.createElement("link");
			css.type = "text/css";
			css.rel = "stylesheet";
			css.href = window.location.protocol + "//ec.europa.eu/wel/surveys/wr_survey01/wr_survey.css";
			document.getElementsByTagName('head')[0].appendChild(css);
			
			// add faded layer
			overlay = document.createElement("div");
			overlay.id = "wr_fade";
			if (overlay.addEventListener) {
				overlay.addEventListener("click", function() {_wrs.closeInvitation(false);}, false);
			} else if (overlay.attachEvent){
				overlay.attachEvent("click", function() {_wrs.closeInvitation(false);});
			}
			document.getElementsByTagName('body')[0].appendChild(overlay);
			
			// add popup
			pop = document.createElement("div");
			pop.id = "wr_overlay";
			pop.style.padding = "0";
			document.getElementsByTagName('body')[0].appendChild(pop);
			
			// call html content
			var scr = document.createElement("script");
			scr.type = "text/javascript";
			scr.src = window.location.protocol + "//ec.europa.eu/wel/surveys/wr_survey01/invitations/invitation_" + _wrs.exposed.doc.lang + ".js";
			document.getElementsByTagName('head')[0].appendChild(scr);
		},
		closeInvitation: function(checked) {
			if(checked) {
				_aux.setCookie("WRshowSurvey","0",30);
			} else {
				_aux.setCookie("WRshowSurvey","0");
			}

			var wr_fade = doc.getElementById("wr_fade");
			wr_fade.parentNode.removeChild(wr_fade);
			var wr_overlay = doc.getElementById("wr_overlay");
			wr_overlay.parentNode.removeChild(wr_overlay);
		},
		exposed: {
			doc: {
				lang: _aux.default_lang,
				head: doc.getElementsByTagName('head')[0],
				body: doc.getElementsByTagName('body')[0],
				url: encodeURIComponent(window.location)
			},
			services: {},
			goToSurvey: function(checked) {
				_wrs.closeInvitation(checked);
				var url = _wrs.survey_links[_wrs.exposed.doc.lang] + "?p=" + encodeURIComponent(window.location);
				var win=window.open(url, '_blank');
				win.focus();
			},
			closeInvitation: function(checked) {
				_wrs.closeInvitation(checked);

			}
		}
	}

	_wrs.init();
	win.wrs_survey							= {};
	win.wrs_survey							= _wrs.exposed;
	win.wrs_survey.renderPopup				= _wrs.renderPopup;
	win.wrs_survey.renderPopupDiv			= _wrs.renderPopupDiv;

})(window, document);