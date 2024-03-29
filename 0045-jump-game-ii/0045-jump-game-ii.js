/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function(nums) {
    const back = (currentIndex, step) => {
        if (currentIndex === 0) return step;
        if (currentIndex <= nums[0]) return step + 1;

        for (let i = 0; i < currentIndex; i++) {
            if (nums[i] >= currentIndex - i) {
                return back(i, step + 1);
            }
        }
    }
    return back(nums.length - 1, 0);
};