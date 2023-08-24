/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    const rotations = k % nums.length;
        if (rotations === 0) {
        return;
    }

    let arr = [];
    for(let j=nums.length-rotations; j<nums.length; j++) {
        arr.push(nums[j]);
    }
    for(let j=0; j<nums.length-rotations; j++) {
        arr.push(nums[j]);
    }

    for (let i=0; i<nums.length; i++) {
        nums[i]=arr[i];
    }
    
};