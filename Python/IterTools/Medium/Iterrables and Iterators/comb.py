from itertools import combinations
n = int(input())
chars = input().strip().split()
k = int(input())
combList = list(combinations(chars,k))
count = 0;
for i in combList:
    if('a' in i):
        count+=1
print(count/len(combList))