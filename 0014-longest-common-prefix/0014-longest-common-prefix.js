/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    strs.sort();

    let first = strs[0];
    let last = strs[strs.length-1];
    let result = "";

    if(strs.length === 0 || first === "") {
        return "";
    }
    
    for(let i=0; i<first.length; i++) {
        if(first[i]===last[i]) {
            result += first[i];
        }else {
            break;
        }
    }

    return result;
};