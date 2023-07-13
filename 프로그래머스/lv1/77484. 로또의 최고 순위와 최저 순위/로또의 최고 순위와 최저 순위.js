function solution(lottos, win_nums) {
  var answer = [];
  let zero = lottos.filter(num => num === 0).length;
  let min = 0;

  for (let i = 0; i < lottos.length; i++) {
    if (lottos.includes(win_nums[i])) {
      min++;
    }
  }

  answer[0] = zero + min > 1 ? 7 - (zero + min) : 6;
  answer[1] = min > 1 ? 7 - min : 6;

  return answer;
}