n = input()
s = set(map(int, raw_input().split()))
t = int(input())
for i in range(t):
    st = str(raw_input()).strip().split(" ")
    if (st[0]=='pop'):
        s.pop()
        continue
    if(st[0]=='remove'):
        if(int(st[1]) in s):
            s.remove(int(st[1]))
        continue
    if st[0]=='discard':
        s.discard(int(st[1]))
        continue
print(sum(s))
    
    
