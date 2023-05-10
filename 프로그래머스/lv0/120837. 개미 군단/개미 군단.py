def solution(hp):
    answer = 0
    if hp%5 == 0:
        return hp//5
    elif hp>5:
        if (hp%5)%3 == 0:
            answer += hp//5 + (hp%5)//3
            return answer
        else:
            answer = hp//5+(hp%5)//3+(hp%5)%3
            return answer
    if 1<hp<5:
        answer = hp//3 + hp%3
    else:
        answer = hp
    return answer