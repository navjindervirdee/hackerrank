n = input()
a = set(map(int,input().strip().split()))
q = int(input())
for i in range(q):
    str = input().strip().split(" ")
    if(str[0]=='intersection_update'):
        b = set(map(int,input().strip().split()))
        a.intersection_update(b)
        continue
    if(str[0]=='update'):
        b = set(map(int,input().strip().split()))
        a.update(b)
        continue
    if(str[0]=='symmetric_difference_update'):
        b = set(map(int,input().strip().split()))
        a ^= set(b)
        continue
    if(str[0]=='difference_update'):
        b = set(map(int,input().strip().split()))
        a -= set(b)
        continue
print(sum(a))