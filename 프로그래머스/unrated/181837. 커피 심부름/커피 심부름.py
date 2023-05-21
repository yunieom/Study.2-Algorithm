def solution(order):
    answer = 0
    for i in order:
        if 'cafelatte' in i:
            answer += 5000
        else:
            print(i)
            answer += 4500
    return answer