function solution(my_string) {
    var answer = [];
    let arr= my_string.split('')
    for(let i=0; i<arr.length; i++) {
        if(arr[i].charCodeAt()<65) {
            answer.push(Number(arr[i]))
        }
    }
    return answer.sort();
}