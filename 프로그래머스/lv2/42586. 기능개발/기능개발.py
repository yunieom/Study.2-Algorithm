import math
def solution(progresses, speeds):
    answer = []
    count = 0
    arr = []
    
    for i in range(len(progresses)):
        arr.append(math.ceil((100-progresses[i])/speeds[i]))

    #print(arr)
    while arr:
        front = arr.pop(0)
        count = 1

        while arr and front >= arr[0]:
            arr.pop(0)
            count += 1

        answer.append(count)

    return answer