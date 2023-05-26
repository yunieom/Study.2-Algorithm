function solution(date1, date2) {
    let d1 = ''
    let d2 = ''
    for(let i=0; i<date1.length; i++) {
        d1 += date1[i].toString();
        d2 += date2[i].toString();
    }
    console.log(d1)
    console.log(d2)
    if (Number(d1)<Number(d2)) {
        return 1
    }else {
        return 0
    }
  
}