def solution(before, after):
    answer = ''
    num1 = 0
    num2 = 0
    for i in range(len(before)):
        num1 += ord(before[i])
        num2 += ord(after[i])
    if num1 != num2:
        return 0
    else:
        return 1
    
    
    