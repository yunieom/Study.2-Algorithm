function solution(arr1, arr2) {
    var answer = 0;
    let count_arr1 = 0
    let count_arr2 = 0
    
    if(arr1.length<arr2.length) {
        return -1;
    }else if (arr1.length>arr2.length) {
        return 1;
    }else {
        for(let i=0; i<arr1.length; i++) {
            count_arr1 += arr1[i]
            count_arr2 += arr2[i]
        }
    }
    
    return count_arr1 > count_arr2 ? 1 : (count_arr1 < count_arr2 ? -1 : 0);

}