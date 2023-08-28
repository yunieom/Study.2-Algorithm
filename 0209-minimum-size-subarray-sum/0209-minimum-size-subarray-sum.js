/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
function minSubArrayLen(target, nums) {
    let left = 0; // 윈도우의 왼쪽 경계
    let sum = 0; // 현재 윈도우의 합
    let minLength = Infinity; // 최소 길이 (처음엔 최대길이로 설정)

    for (let right = 0; right < nums.length; right++) {
        sum += nums[right]; // 윈도우를 오른쪽으로 확장

        while (sum >= target) {
            minLength = Math.min(minLength, right - left + 1); // 최소 길이 업데이트
            sum -= nums[left]; // 윈도우를 왼쪽으로 축소
            left++;
        }
    }

    return minLength !== Infinity ? minLength : 0;
}