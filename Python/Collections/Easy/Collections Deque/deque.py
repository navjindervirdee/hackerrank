from collections import deque
d = deque()
n = int(input())
for i in range(n):
    op = input().strip().split()
    if(op[0]=='append'):
        d.append(int(op[1]))
    if(op[0]=='appendleft'):
        d.appendleft(int(op[1]))
    if(op[0]=='pop'):
        d.pop()
    if(op[0]=='popleft'):
        d.popleft()
        
for item in d:
    print(item,end=" ")
        
        