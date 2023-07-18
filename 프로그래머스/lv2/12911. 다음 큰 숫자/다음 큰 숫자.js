function solution(n) {
    const countOne = (n) => {
        let binary = n.toString(2);
        let count = 0;
        for (let i = 0; i < binary.length; i++) {
            if (binary[i] === '1') {
                count++;
            }
        }
        return count;
    }

    const nextCount = countOne(n); 
    for (let i=n+1; ; i++) {
        if (countOne(i) === nextCount) {
            return i;
        }
    }
}
