function solution(k, score) {
    var answer = [];
    var arr = [];
    
    for(let i=0; i<score.length; i++) {
        arr.push(score[i]);
        arr.sort(function(a, b)  {
          return b - a;
        });
        if(i>=k){
            arr.pop();
        }
        answer.push(arr.at(-1))
    }
    return answer;
}