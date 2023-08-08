/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function(num) {
    let arr = num.toString().split('').sort();
    const a = parseInt(arr[0]+arr[2]);
    const b = parseInt(arr[1]+arr[3]);
    return a+b;
};