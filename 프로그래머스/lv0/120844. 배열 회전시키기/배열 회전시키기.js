function solution(numbers, direction) {
    var answer = [];
    //큐 & 스택으로 풀기
    let new_num = 0;
    if(direction === 'right') {
        new_num = numbers[numbers.length-1];
        numbers.pop();
        numbers.unshift(new_num);
    }else {
        new_num = numbers[0]
        numbers.shift();
        numbers.push(new_num)
    }
    

    return numbers;
}