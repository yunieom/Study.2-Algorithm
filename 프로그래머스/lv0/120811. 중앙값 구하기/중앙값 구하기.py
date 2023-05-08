def solution(array):
    answer = 0
    mid = len(array)//2
    answer = sorted(array)
    return answer[mid]