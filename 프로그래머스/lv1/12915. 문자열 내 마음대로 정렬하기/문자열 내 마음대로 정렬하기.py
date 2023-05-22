def solution(strings, n):
    arr = []
    for i in strings:
        arr.append(i[n]+i)
        arr.sort()
    answer = [] 
    for i in arr:
        answer.append(i[1:])
    return answer