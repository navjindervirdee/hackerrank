from itertools import product
A = list(map(int,input().strip().split()))
B = list(map(int,input().strip().split()))
C = list(product(A,B))
for row in C:
    print(tuple(row), end = ' ')
