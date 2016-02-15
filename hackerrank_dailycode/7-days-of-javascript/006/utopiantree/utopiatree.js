process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function getUtopiaTreeLength(cycle) {
    var height = 1;

    if(cycle==0)
        return 1;

    for(var i=1; i<=cycle; i++) {
        if(i%2==1)
            height = height*2;
        else
            height = height +1;
    }
    return height;
}

function main() {
    var t = parseInt(readLine());
    for(var a0 = 0; a0 < t; a0++){
        var n = parseInt(readLine());
        console.log(getUtopiaTreeLength(n));
    }

}
