function solution(name, yearning, photo) {
    var answer = [];
    let score = 0;
    
    for(let i=0; i<photo.length; i++) {
       for(let j=0; j<name.length; j++){
           if(photo[i].includes(name[j])) {
               score += yearning[j];
           }else{
               answer[i]=0;
           }
       }
       answer[i]=score;
       score=0;
    }
    return answer;
}