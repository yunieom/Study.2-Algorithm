def solution(num_list):
    multiply = 1
    square = 0
    for i in num_list:
        multiply *= i
        square += i

    if multiply > square**2:
        print(multiply)
        print(square**2)   
        return 0
    else: 
        return 1
 