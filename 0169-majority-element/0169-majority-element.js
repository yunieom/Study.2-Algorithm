/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    nums.sort((a,b)=> a-b);
    let max_cnt = 0;
    let cur_cnt = 0;
    let cur_val;
    let max_val;

    if(nums.length === 1) {
        return nums[0];
    }

    for(let i=0; i<nums.length; i++) {
        if(nums[i] === cur_val) {
            cur_cnt++;
            console.log('1:',cur_val, cur_cnt)
        }else {
            cur_val = nums[i];
            cur_cnt = 1;
        }

        if(cur_cnt > max_cnt) {
            max_cnt = cur_cnt;
            max_val = cur_val;
        }
    }

    return max_val;
};