def solution(numbers):
    newArr = sorted(numbers);
    return newArr[len(newArr)-1]*newArr[len(newArr)-2];