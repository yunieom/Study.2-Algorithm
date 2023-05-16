def solution(n, lost, reserve):
    clothes = [1] * n  

    for l in lost:
        clothes[l - 1] -= 1  

    for r in reserve:
        clothes[r - 1] += 1  

    for i in range(n):
        if clothes[i] == 0:  
            if i > 0 and clothes[i - 1] == 2:  
                clothes[i] = 1
                clothes[i - 1] = 1
            elif i < n - 1 and clothes[i + 1] == 2:
                clothes[i] = 1
                clothes[i + 1] = 1

    answer = n - clothes.count(0) 

    return answer
