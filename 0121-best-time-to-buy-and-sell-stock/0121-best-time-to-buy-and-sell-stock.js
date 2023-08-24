/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let min = prices[0];
    let max = 0;
    for(let i=0; i<prices.length; i++) {
        if(min>prices[i]) {
            min = prices[i];
        }else {
            const cur = prices[i]-min;
            console.log(i,":",cur) // 계속 변화하는 cur값을 확인해볼 것 cur 값: 현재 값-최저 값을 뺀 이익
            if(cur>max) {
                max=cur;
            }
        }
    }
    return max;
};