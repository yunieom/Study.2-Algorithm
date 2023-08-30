/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let arr = [];
    let word = '';
    
    for(i of s) {
        if(i === ' ') {
            word = '';
        }else {
            word += i;
            arr.push(word)
        }
    }

    return arr.at(-1).length;
};