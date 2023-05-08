import math;
def solution(money):

    coffee = math.floor(money / 5500 )
    change = money - (5500*coffee)
    return [coffee, change]