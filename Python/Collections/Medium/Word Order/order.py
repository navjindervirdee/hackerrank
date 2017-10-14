from collections import OrderedDict ,Counter
n = int(input())
d = OrderedDict()
od = dict()
for i in range(n):
    s = input().strip()
    d[s] = i
    if(s in od):
        od[s]+=1
        continue
    od[s] = 1
    
print(len(od))
for i in d:
    print(od[i],end=' ')