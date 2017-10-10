k=int(input())
rooms = list(map(int,input().strip().split()))
d = dict()
for i in rooms:
    if(i in d):
        d[i] = d[i] + 1
        continue
    d[i] = 1
for  key in d:
    if(d[key]==1):
        print(key)
        break