def solution(num_list):
    answer = []
    for i in sorted(num_list):
        answer.append(i)
    return answer[5:len(answer)]