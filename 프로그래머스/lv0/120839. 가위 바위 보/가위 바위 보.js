function solution(rsp) {
    var answer = '';
    let arr = rsp.split('');

    arr.forEach(i => {
        if (i === '2'){
            answer+='0';
        }
        else if(i === '0'){
            answer+='5';
        }
        else {
            answer+='2';
        }
    })

    return answer;
}