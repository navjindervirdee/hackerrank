n = int(input())
array = list(map(int,input().strip().split()))
pos = all(x>0 for x in array)
palin = 0
if(pos):
    array = list(map(str,array))
    palin = any(x==x[::-1] for x in array)
    print(palin)
else:
    print(pos)