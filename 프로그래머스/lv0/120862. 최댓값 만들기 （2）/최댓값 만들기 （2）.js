function solution(numbers) {
    var neg = 0;
    var pos = 0;
    numbers = numbers.sort(function(a, b)  {
  return a - b;
});
    for(let i=0; i<numbers.length; i++) {
        if(numbers[i]<0) {
            neg++
        }else{
            pos++
        }
    }
    if (neg%2 === 0) {
        neg = Math.abs(numbers[0])+Math.abs(numbers[1])
        pos = numbers[numbers.length-1]+numbers[numbers.length-2]
        if(neg>pos) {
            return Math.abs(numbers[0])*Math.abs(numbers[1])
        }else {
            return numbers[numbers.length-1]*numbers[numbers.length-2]
        }
    }else {
        return numbers[numbers.length-1]*numbers[numbers.length-2]
    }
    
}