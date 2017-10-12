from itertools import product
k,m = map(int,input().strip().split())
List = list()
for i in range(k):
    l = list(map(int,input().strip().split()))[1:]
    List.append(l)
productList = list(product(*List))

maxi = -1
for l in productList:
    suml = sum(i**2 for i in l)%m
    if(suml>maxi):
        maxi=suml
print(maxi)


               
