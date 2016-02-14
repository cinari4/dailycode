for(var i of my_array){
    var tmp = i.split("").reverse().join("");
    if(tmp === i)
        console.log(tmp);
}
