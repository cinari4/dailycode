// test case test_lbsToKg
function test_lbsToKg()  {
    if(lbsToKg(45) != 20.412)
        alert("test fail");
}

// test case test_kgTolbs
function test_kgTolbs()  {
    if(kgToLbs(100) != 220.462)
        alert("test fail");
}

// test case test_kgToBarbellPlate
function test_kgToBarbellPlate()  {
    var str = "20kg x 4개\n15kg x 0개\n10kg x 0개\n2.5kg x 0개\n1kg x 0개\n0.5kg x 0개\n나머지 : 0";
    if(test_kgToBarbellPlate(100) != str)
        alert("test fail");
}