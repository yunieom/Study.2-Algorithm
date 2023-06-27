function solution(s) {
  const result = [];
  const positions = {};

  for (let i = 0; i < s.length; i++) {
    
    const current = s[i];
    if (current in positions) {
      result.push(i - positions[current]);
    } else {
      result.push(-1);
    }
    positions[current] = i;
  }
  
  return result;
}