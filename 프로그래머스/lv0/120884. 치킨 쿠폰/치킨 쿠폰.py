import math;
def solution(chicken):
    answer = 0;
    free = 0;
    coupon = 0;
    while chicken >= 10:
        free = chicken//10
        coupon = chicken%10
        answer = answer + free
        chicken = free+coupon
    return answer