/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let k=0;
    for(let i=0; i<nums.length; i++) {
        let val = nums[i+1];
        if(val==nums[i]) {
            k++;
            if(k>=2) {
                nums.splice(i,1);
                i--;
                k--;
            }
        }else{
            k=0;
        }
    }
};