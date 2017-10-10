A = set(map(int,input().strip().split()))
q = int(input())
strict = True;
for i in range(q):
    N = set(map(int,input().strip().split()))
    C = A&N
    if(C!=N or len(C)==len(A)):
       strict = False;
if(strict):
    print(True)
else:
    print(False)
        