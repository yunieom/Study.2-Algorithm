/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const arr1 = [];
    const map = {
        "(": ")",
        "{": "}",
        "[": "]"
    }
    if(s.length%2 !== 0) {
        return false;
    }
    for(const char of s) {
        if(char in map) {
            arr1.push(char);
        }else {
            if(!arr1.length || map[arr1.pop()] !== char) {
                return false;
            }
        }
    }
    return arr1.length === 0;

};