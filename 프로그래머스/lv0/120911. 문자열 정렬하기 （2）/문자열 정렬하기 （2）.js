function solution(my_string) {
    var answer = my_string.toLowerCase()
    let arr = answer.split('').sort()
    return arr.join('');
}