function solution(brown, yellow) {
    var total = brown + yellow;

    for(let i=3; i<=Math.sqrt(total); i++) {
        if(total%i === 0) {
            let width = total / i;
            //let brown_num = i * width - 2;
            let brown_num = (i + width) * 2 - 4;
            let yellow_num = total - brown;
            
            if(brown_num === brown && yellow_num === yellow) {
                return [width, i];
            }
        }
        
    }

}

// 00000000
// 01111110
// 01111110
// 01111110
// 01111110
// 00000000
// 0000
// 0110
// 0000
// 12 4*3
// 9 3*3
// 48 8*6
// 1,2,3,4,6,12
// 1,3,9
// 1,2,3,4,6,8,12,16,24,48

