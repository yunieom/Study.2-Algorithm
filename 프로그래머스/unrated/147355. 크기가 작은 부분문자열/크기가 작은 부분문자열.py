def solution(t, p):
    answer = 0
    arr = []
    length = len(p)

    for i in range(len(t)):
        if int(t[i:i+length]) <= int(p) and len(t[i:i+length]) == length: 

            answer += 1
        
    return answer