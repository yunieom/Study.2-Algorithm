/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let str_arr1 = word1.split('');
    let str_arr2 = word2.split('');
    let arr = [];
    
    let index = 0;
    
    if(str_arr1.length > str_arr2.length) {
        index = str_arr1.length;    
    }else {
        index = str_arr2.length;
    }
    
    for(let i=0; i<index; i++) {
        arr.push(str_arr1[i]);
        arr.push(str_arr2[i]);
    }
    
    return arr.join('');
    
};