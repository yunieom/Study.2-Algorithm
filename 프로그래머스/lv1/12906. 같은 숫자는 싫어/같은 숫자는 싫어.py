def solution(arr):
    answer = []
    for i in range(0,len(arr)-1):
        cur = arr[i]
        nx = arr[i + 1]
        if cur != nx:
            answer.append(cur)
    #print(arr[-1])
    answer.append(arr[-1])
    return answer