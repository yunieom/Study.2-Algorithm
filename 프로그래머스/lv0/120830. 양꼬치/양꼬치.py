import math;

def solution(n, k):
    answer = 0;
    num = math.floor(n/10);
    if num>=1:
        return (n*12000) + (k*2000) - (num*2000);
    else: 
        return n*12000 + k*2000;
