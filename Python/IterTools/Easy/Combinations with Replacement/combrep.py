from itertools import combinations_with_replacement  
string = input().strip().split()
string[0] = sorted(string[0])
k = int(string[1])
combList = list(combinations_with_replacement(string[0],k))
combList = [''.join(s) for s in combList]
for i in combList:
    print(i)