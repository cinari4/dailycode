function processData(input) {
    var monyYouHave =  input.split('\n')[0].split(' ')[1];
    var toysList = input.split('\n')[1].split(' ').sort(function(a, b){return a-b});
    console.log(getNumOfToys(toysList, monyYouHave));
}

function getNumOfToys(list, monyYouHave) {
    var num=0;
    for(var i=0; i<list.length; i++) {
        if(monyYouHave-list[i]>=0) {
            monyYouHave = monyYouHave-list[i];
            num=num+1;
        } else {
            break;
        }
    }
    return num;
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});


