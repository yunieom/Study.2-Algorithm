function solution(sizes) {
    let max_width = 0;
    let max_height = 0;

    for (let i = 0; i < sizes.length; i++) {
        const width = Math.max(sizes[i][0], sizes[i][1]);
        const height = Math.min(sizes[i][0], sizes[i][1]);
        max_width = Math.max(max_width, width);
        max_height = Math.max(max_height, height);
    }

    return max_width * max_height;
}
