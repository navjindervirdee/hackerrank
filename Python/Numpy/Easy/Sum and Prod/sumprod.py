import numpy as np
n,m = map(int,input().strip().split())
arr = np.zeros([n,m],dtype = np.int32)
for i in range(n):
    arr[i,:] = list(map(int,input().strip().split()))
sum = np.sum(arr,axis=0)
prod = np.prod(sum,axis=0)
print(prod)


    
    
