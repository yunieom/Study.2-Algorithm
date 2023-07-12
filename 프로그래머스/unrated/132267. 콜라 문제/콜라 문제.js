function solution(a, b, n) {
    var answer = 0;
    let total = n;
    let cut = 0

    while(total>=a){
        cut = Math.floor(total/a);
        total = total-(a*cut)+(b*cut);
        answer += b*cut
    }
    // if(total===a){
    //     answer+=b;
    // }
    return answer;
}

