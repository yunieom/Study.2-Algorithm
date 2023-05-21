def solution(my_string, s, e):
    answer = ''
    new_str1 = my_string[s:e+1]
    answer = ''.join(list(reversed(new_str1)))
    return my_string[0:s]+answer+my_string[e+1:len(my_string)]