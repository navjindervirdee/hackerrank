from collections import defaultdict
n,m = map(int,input().split())
A = defaultdict(list)
B = list()
for i in range(n):
    c = input().strip()
    A[c].append(i+1)
    
for i in range(m):
    List = A[input().strip()]
    if(len(List)==0):
        print(-1)
        continue
    for i in List:
        print(i,end=' ')
    print()
 
    