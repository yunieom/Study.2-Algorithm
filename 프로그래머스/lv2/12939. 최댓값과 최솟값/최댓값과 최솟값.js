function solution(s) {
    const arr = s.split(' ');
    let max = parseInt(arr[0])
    let min = parseInt(arr[0])
    for(let i=0; i<arr.length; i++) {
        max = max > parseInt(arr[i]) ? max : parseInt(arr[i]);
        min = min < parseInt(arr[i]) ? min : parseInt(arr[i]);
    }
    return min+' '+max;
}