function solution(n, words) {
    var answer = [0, 0];
    
    for(let i=0; i<words.length; i++) {
        let word = words[i];
        let person = i % n + 1;
        let turn = Math.ceil((i + 1)/n);
        
        if(i > 0){
            let last = words[i-1].at(-1);
            
            if (i > words.indexOf(word) || words[i].at(0) !== last) {
                answer = [person, turn];
                break;
            }
        }
    }
    return answer;
}