/*!
 * convertutils.js (cinari4@gmail.com)
 */
const POUNDS_TO_KILOGRAMS = 0.453592;
const KILOGRAMS_TO_POUNDS = 2.20462;
const DEFAULT_BARBEL_KG = 20;
const DEFAULT_BARBEL_LBS = 44.0925;

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

    if(kg <= DEFAULT_BARBEL_KG) {
        return "shuld be over " + DEFAULT_BARBEL_KG + "kg";
    }

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

    returnStr += "bar is : " + DEFAULT_BARBEL_KG + "kg" + "\n";
    returnStr += "remain : " + kgRemain + "kg";
    return returnStr;
}

function lbsToBarbellPlate(lbs) {
    if(checkValidation(lbs))
        return false;

    var lbsList = [45, 35, 25, 15, 10, 5];
    var lbsCount = [0, 0, 0, 0, 0, 0];
    var lbsRemain = lbs - DEFAULT_BARBEL_LBS;
    var returnStr = "";

    if(lbs <= DEFAULT_BARBEL_LBS) {
        return "shuld be over " + DEFAULT_BARBEL_LBS + "lbs";
    }

    for(index=0; index<lbsList.length; index++) {
        var divisor = parseInt(lbsRemain/lbsList[index]);
        if(divisor > 0){  
            lbsCount[index] = divisor;
            lbsRemain = lbsRemain % lbsList[index];
        }
    }
    
    for(index=0; index<lbsList.length; index++) {
        returnStr += (lbsList[index] + "lbs x " + lbsCount[index] + "\n");
    }

    returnStr += "bar is : " + DEFAULT_BARBEL_LBS + "lbs" + "\n";
    returnStr += "remain : " + lbsRemain + "lbs";
    return returnStr;
}

function checkValidation(val) {
    if(val == null || isNaN(val) || val <= 0) {
       alert("invalid input data");
       return true;
    }
    return false;
}