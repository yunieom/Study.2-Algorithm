def solution(sides):
    answer = 0
    newArr = sorted(sides);
    maxNum = newArr[2];
    if newArr[0]+newArr[1] > maxNum:
        return 1;
    else:
        return 2;
