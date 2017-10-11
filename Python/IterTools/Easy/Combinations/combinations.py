from itertools import combinations
inputString = input().strip().split()
combList = list()
k = int(inputString[1])+1
string = sorted(inputString[0])
for i in range(1,k):
    temp = list(combinations(string,i))
    temp = [''.join(s) for s in temp]
    temp = sorted(temp)
    combList = combList + temp

for s in combList:
    print(s)
