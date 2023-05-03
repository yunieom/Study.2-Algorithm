function solution(num_list) {
    var answer = 0;
    for(let i=0; i<num_list.length; i++) {
        while(1) {
            if(num_list[i] ===1 ) break;
            if(num_list[i]%2 === 0){
                num_list[i] = num_list[i]/2;
                answer++;
            }else if(num_list[i] % 2 === 1) {
                num_list[i] = num_list[i]-1;
            }
        }
    }

    return answer;
   
}   