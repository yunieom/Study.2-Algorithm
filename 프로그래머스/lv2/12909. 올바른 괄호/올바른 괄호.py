def solution(s):
    stack = []
    brackets = {'(': ')'}

    for i in s:
        if i in brackets:  
            stack.append(i)
        else:
            if not stack:  
                return False
            top = stack.pop()
            if brackets[top] != i:  
                return False

    if stack:  # 스택에 남아있는 괄호가 있는 경우
        return False
    
    return True
