def solution(arr):
    answer = []
    for i in range(0,len(arr)-1):
        if arr[i] != arr[i+1]:
            answer.append(arr[i])
    #print(arr[-1])
    answer.append(arr[-1])
    return answer