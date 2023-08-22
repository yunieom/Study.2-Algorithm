/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {

    for(let i=0; i<nums.length; i++) {
        if (nums[i] === val) {
            nums.splice(i, 1);
            i--; // 같은 수가 여러개 일때를 대비. 인덱스를 줄여 다시 검사
        }
    }
    nums.sort();
    return nums.length;
};