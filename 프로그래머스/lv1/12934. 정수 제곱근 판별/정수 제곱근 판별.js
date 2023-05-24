function solution(n) {
    if(Math.sqrt(n)%1 == 0) {
        var x = Math.sqrt(n)
        return (x+1)*(x+1)
    }else {
        return -1
    }
}