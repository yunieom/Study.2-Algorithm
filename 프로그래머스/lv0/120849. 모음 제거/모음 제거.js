function solution(my_string) {
    
    var arr = my_string.split('');
    var arr2 = ["a","e","i","o","u"];
    var answer = arr.filter(x=> !arr2.includes(x));

    return answer.join('');
}