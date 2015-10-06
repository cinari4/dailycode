/*!
 * convertutils.js (cinari4@gmail.com)
 */
const POUNDS_TO_KILOGRAMS = 0.453592;
const KILOGRAMS_TO_POUNDS = 2.20462;
const DEFAULT_BARBEL_KG = 20;

function lbsToKg(lbs) {
    if(checkValidation(lbs))
        return false;
    return (lbs*POUNDS_TO_KILOGRAMS).toFixed(3);
}

function kgToLbs(kg) {
    if(checkValidation(kg))
        return false;
    return (kg*KILOGRAMS_TO_POUNDS).toFixed(3);
}

function kgToBarbellPlate(kg) {
    if(checkValidation(kg))
        return false;

    var kgList = [20, 15, 10, 2.5, 1, 0.5];
    var kgCount = [0, 0, 0, 0, 0, 0];
    var kgRemain = kg - DEFAULT_BARBEL_KG;
    var returnStr = "";

    for(index=0; index<kgList.length; index++) {
        var divisor = parseInt(kgRemain/kgList[index]);
        if(divisor > 0){  
            kgCount[index] = divisor;
            kgRemain = kgRemain % kgList[index];
        }
    }
    
    for(index=0; index<kgList.length; index++) {
        returnStr += (kgList[index] + "kg x " + kgCount[index] + "\n");
    }
    returnStr += "remain : " + kgRemain;
    return returnStr;
}

function checkValidation(val) {
    if(val == null || isNaN(val) || val <= 0) {
       alert("invalid input data");
       return true;
    }
    return false;
}