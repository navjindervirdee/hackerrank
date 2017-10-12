from collections import Counter
n = int(input())
shoes = list(map(int,input().split()))
counts = Counter(shoes)
q = int(input())
sum = 0
for _ in range(q):
    size,money = map(int,input().split())
    if(counts[size]>0):
       sum = sum + money 
       counts[size] -=1 
print(sum)
   

   