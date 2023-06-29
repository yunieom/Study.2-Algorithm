function solution(number, limit, power) {
  var answer = 0;

  for (var i = 1; i <= number; i++) {
    var count = 0;

    // 제곱근까지 약수 개수를 구함
    for (var j = 1; j * j <= i; j++) {
      if (i % j === 0) {
        count++;
        // 제곱근이 아닌 경우, 대칭성을 이용하여 약수 개수를 2배로 증가
        if (j * j !== i) {
          count++;
        }
      }
    }

    if (count > limit) {
      count = power;
    }

    answer += count;
  }

  return answer;
}
