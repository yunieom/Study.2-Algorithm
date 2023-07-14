function solution(lottos, win_nums) {
    var answer = [];
    let zero = lottos.filter(num => num === 0).length;
    let min = 0;
    
    for (let i = 0; i < lottos.length; i++) {
      if (lottos.includes(win_nums[i])) {
        min++;
      }
    }
    
    let max = min + zero
    switch (max) {
      case 0:
        answer[0] = 6;
        break;
      case 1:
        answer[0] = 6;
        break;
      case 2:
        answer[0] = 5;
        break;
      case 3:
        answer[0] = 4;
        break;
      case 4:
        answer[0] = 3;
        break;
      case 5:
        answer[0] = 2;
        break;
      case 6:
        answer[0] = 1;
        break;
    }
    
    switch (min) {
      case 0:
        answer[1] = 6;
        break;
      case 1:
        answer[1] = 6;
        break;
      case 2:
        answer[1] = 5;
        break;
      case 3:
        answer[1] = 4;
        break;
      case 4:
        answer[1] = 3;
        break;
      case 5:
        answer[1] = 2;
        break;
      case 6:
        answer[1] = 1;
        break;
    }
   
    
    
    return answer;
}