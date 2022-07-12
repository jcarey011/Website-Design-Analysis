
function padNum (n) {
    if (n < 10) {
	return '0' + n;
    } else {
	return n;
    }
}


function calendarPageLoad()
{
    var now = new Date();
    var m = padNum(1 + now.getMonth());
    var d = padNum(now.getDate());
    var nowDT = "" + now.getFullYear() + '-' + m + '-' + d;
    var h = padNum(now.getHours());
    var min = padNum(now.getMinutes());
    var s = padNum(now.getSeconds());
    nowDT = nowDT + "T" + h + ":" + min + ":" + s;
    //alert ("nowDT: " + nowDT);
    var allLis = document.getElementsByTagName("li");
    var lastLi = null;
    var lastLi2 = null;
    for (var li of allLis) {
	if (li.getAttribute("class") === "calendarEvent") {
	    var start = li.getAttribute("start");
	    var stop = li.getAttribute("stop");
	    var firstCurrent = -1;
	    var newClass = "";
	    if (nowDT < start) {
		newClass = "futureEvent";
		if (lastLi != null) {
		    lastLi.setAttribute('class', 'recentEvent');
		    lastLi = null;
		}
		if (lastLi2 != null) {
		    lastLi2.setAttribute('class', 'recentEvent');
		    lastLi2 = null;
		}
	    } else if (nowDT > stop) {
		newClass = "pastEvent";
        lastLi2 = lastLi;
		lastLi = li;
	    } else {
		newClass = "currentEvent";
		if (lastLi != null) {
		    lastLi.setAttribute('class', 'recentEvent');
		    lastLi = null;
		}
		if (lastLi2 != null) {
		    lastLi2.setAttribute('class', 'recentEvent');
		    lastLi2 = null;
		}
	    }
	    li.setAttribute('class', newClass);
	}
    }
	if (lastLi != null) {
	    lastLi.setAttribute('class', 'recentEvent');
	    lastLi = null;
	}
	if (lastLi2 != null) {
	    lastLi2.setAttribute('class', 'recentEvent');
	    lastLi2 = null;
	}
}

window.addEventListener('load',  (event) =>  {
     calendarPageLoad();
});
          
          
