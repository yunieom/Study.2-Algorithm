import string
# def solution(priorities, location):

#     max_num = priorities.index(max(priorities))

#     #알파벳 배열 만들기
#     alphabet = string.ascii_lowercase
#     arr = list(alphabet[:len(priorities)])
#     print(arr)
    
#     #location에 해당하는 알파벳 찾아내기
#     final_location = arr[location]
#     print(final_location)
#     # value = ''
#     # for i in range(len(priorities)):
#     #     print(i)
#     #     if priorities[i] != priorities[max_num]:
#     #         value = arr.pop(0)
#     #         arr.append(value) 
#     #     else:
#     #         print(arr)
#     #         return arr.index(final_location)+1
# #     for i in range(len(priorities)):
# #         max_priority = max(priorities)
# #         priority = priorities.pop(0)
# #         process = arr.pop(0)
        
# #         if priority < max_priority:
# #             priorities.append(priority)
# #             arr.append(process)
# #         else:
# #             if process == final_location:
# #                 return i + 1
        
# #     return -1
#         #ist(sorted(dq, reverse=True)) 


from collections import deque

def solution(priorities, location):
    # 프로세스를 (우선순위, 인덱스) 쌍으로 큐에 저장
    queue = deque([(p, i) for i, p in enumerate(priorities)])
    count = 0  # 실행된 프로세스의 개수

    while queue:
        cur_priority, cur_index = queue.popleft()
        # 큐에 우선순위가 더 높은 프로세스가 있는지 확인
        if any(cur_priority < p for p, _ in queue):
            queue.append((cur_priority, cur_index))  # 뒤로 이동
        else:
            count += 1  # 실행
            if cur_index == location:
                return count  # 목표 위치의 프로세스 실행

    return count