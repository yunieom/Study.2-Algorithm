function solution(babbling) {
    var answer = 0;
    for (let i=0; i<babbling.length; i++) {
        if(babbling[i].includes('aya')){
            babbling[i] = babbling[i].replace('aya','.')
        }
        if(babbling[i].includes('ye')){
            babbling[i] = babbling[i].replace('ye','.')
        }
        if(babbling[i].includes('woo')){
            babbling[i] = babbling[i].replace('woo','.')
        }
        if(babbling[i].includes('ma')){
            babbling[i] = babbling[i].replace('ma','.')
        }
        babbling[i] = babbling[i].replace(/\./g, '');
        console.log(babbling[i])
        if(babbling[i]===''){
            answer++
        }
    }
    return answer; 
}