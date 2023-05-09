def solution(num_list, n):
    answer = []
    arr = num_list[n:]
    for i in range(0,n):
        arr.append(num_list[i])
    return arr