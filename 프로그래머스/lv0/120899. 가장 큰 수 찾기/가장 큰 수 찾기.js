function solution(array) {
    var answer = [];
    let flag = 0 
    let index = 0;
    for(let i=0; i<array.length; i++){
        if(array[i]<array[i+1]) {
            flag = array[i+1]
            index = i+1
        }   
    }
    answer = [flag,index]
    return answer;
}