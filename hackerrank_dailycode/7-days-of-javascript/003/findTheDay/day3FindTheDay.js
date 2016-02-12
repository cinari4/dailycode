function findDay(myDate) {
    if(myDate == "-1")
        return false;

    var strDate = myDate.split("/");
    var d = new Date();
    d.setFullYear(strDate[2], strDate[0]-1, strDate[1]);
    console.log(getDay(d.getDay()));
    return true;
}

function getDay(numDay) {
    var days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
    return days[numDay]
}

// tail starts here
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    var dates = _input.split('\n');

    for (var i = 0; i < dates.length - 1; i++) {
        if(!findDay(dates[i]))
            break;
    }
});
