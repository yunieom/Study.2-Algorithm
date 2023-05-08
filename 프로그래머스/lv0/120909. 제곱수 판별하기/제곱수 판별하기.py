def solution(n):
    answer = 0
    for i in range(1,n):
        if i*i == n:
            print(i)
            answer = 1
    if answer != 0:
        return 1
    else:
        return 2
