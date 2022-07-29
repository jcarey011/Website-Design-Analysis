var openCloseMap = new Map();

function showOCMap ()
{
    var str = "";
    
    for (var key of openCloseMap.keys()) {
	if (str != "") {
	    str = str + " ";
	}
	str = str + key;
    }
    return str;
}


function setCookie(cname, cvalue) {
    var d = new Date();
    var expirationInDays = 7;
    var cookiePath = document.href;
    d.setTime(d.getTime() + (expirationInDays*24*60*60*1000));
    var expires = "expires="+ d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=" + cookiePath;
}

function getCookie(cname) {
    // From http://www.w3schools.com/js/js_cookies.asp
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i <ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}


function toggleDisplay (sectionName)
{
    var theDiv = document.getElementById(sectionName);
    var theButton = document.getElementById("but" + sectionName);
    if (theDiv) {
	if (theDiv.style.display == 'none') {
            theDiv.style.display = "block";
	    theButton.value = "-";
	    openCloseMap.delete(sectionName);
	} else {
            theDiv.style.display = "none";
	    theButton.value = "+";
	    openCloseMap.set(sectionName, 1);
	}
    }
    setCookie ("openCloseMap", showOCMap());
    //alert("OCMap: " + showOCMap());
};

function collapseAll()
{
    var allButtons = document.getElementsByTagName("input");
    for (var i = 0; i < allButtons.length; ++i) {
        var button = allButtons[i];
	if (button.type == "button"
	    && button.getAttribute("class")
	    && button.getAttribute("class") === "expandButton") {
	    var buttonID = button.getAttribute("id");
	    var sectionName = buttonID.substr(3);
	    var theDiv = document.getElementById(sectionName);
	    if (button.value === '-') {
		toggleDisplay(sectionName);
	    }
	}
    }
};

function expandAll()
{
    var allButtons = document.getElementsByTagName("input");
    for (var i = 0; i < allButtons.length; ++i) {
        var button = allButtons[i];
	if (button.type == "button"
	    && button.getAttribute("class")
	    && button.getAttribute("class") === "expandButton") {
	    var buttonID = button.getAttribute("id");
	    var sectionName = buttonID.substr(3);
	    var theDiv = document.getElementById(sectionName);
	    if (button.value === '+') {
		toggleDisplay(sectionName);
	    }
	}
    }
};

function visitPage (url)
{
    location.href = url;
}


function modulePageLoad()
{
    var ocValues = getCookie("openCloseMap");
    //alert ("cookie: " + ocValues);
    expandAll();
    for (var key of ocValues.split(" ")) {
	if (key != "") {
	    toggleDisplay(key);
	}
    }
}

window.addEventListener('load',  (event) =>  {
      modulePageLoad();
});
      
