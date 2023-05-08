def solution(myString, pat):
    str1 = ''
    for i in pat:
        if i == "A":
            str1 += "B"
        else:
            str1 += "A"
    if str1 in myString:
        return 1
    else:
        return 0
