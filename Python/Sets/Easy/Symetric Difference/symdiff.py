n = input()
a = set(map(int,input().strip().split()))
m = input()
b = set(map(int,input().strip().split()))
c = list(a^b)
c = sorted(c)
for i in c:
    print(i)