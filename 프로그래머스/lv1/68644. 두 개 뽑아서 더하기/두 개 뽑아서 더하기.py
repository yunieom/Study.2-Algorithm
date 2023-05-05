from itertools import *

def solution(numbers):
    answer = []
    arr = sorted(numbers);
    for i in range(0,len(arr)-1):
        for j in range(1,len(arr)):
            if i!=j:
                answer.append(arr[i]+arr[j])

    newList = set(answer)
    return sorted(list(newList))