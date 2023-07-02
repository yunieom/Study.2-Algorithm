function solution(k, tangerine) {
    var counts = {};
    tangerine.forEach(j => counts[j] = (counts[j] ?? 0) + 1);
    var sortedBySize = Object.values(counts).sort((a, b) => a - b);
    
    var restCount = tangerine.length - k;
    var sum = 0;
    
    var typeCount = Object.keys(counts).length;
    
    for (const count of sortedBySize) {
        if (sum + count > restCount) {
            break;
        }
        sum += count;
        typeCount--;
    }
    
    return typeCount;
}