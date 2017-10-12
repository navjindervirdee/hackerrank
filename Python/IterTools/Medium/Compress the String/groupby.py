from itertools import groupby
string = str(input())
values = groupby(string)
for key,group in values:
    print('(' + str(len(list(group))) + ', ' + str(key) + ') ',end = '')
    