def solution(strings, n):
    arr = []
    for i in strings:
        arr.append(i[n]+i)
        #print(arr)
        arr.sort()
    return [s[1:] for s in arr]
    # print(arr)    
    # answer = []  
    # for i in arr:
    #     answer.append(i[1:])
    # return answer