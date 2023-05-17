def solution(spell, dic):
    answer = 0
    print('spell',sorted(spell))

    for i in dic:
        print(sorted(i) == sorted(spell))
        if sorted(i) == sorted(spell):
            answer = 1
            return answer
        else: 
            answer = 2
            
    return answer
