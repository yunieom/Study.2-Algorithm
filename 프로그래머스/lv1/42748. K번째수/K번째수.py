def solution(array, commands):
    answer = []
    arr = []
    for i in range(len(commands)):
        num1 = commands[i][0] 
        num2 = commands[i][1]
        num3 = commands[i][2]-1
        arr = array[num1-1:num2]
        arr.sort()
        answer.append(arr[num3])
        
    return answer