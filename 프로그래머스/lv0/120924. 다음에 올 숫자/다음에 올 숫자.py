def solution(common):

    if (common[1]-common[0]) == (common[2]-common[1]):
        a = common[1]-common[0]
        return common[len(common)-1]+a;
    else:
        a = common[1]/common[0]
        return common[len(common)-1]*a;