import numpy as np
n,m = map(int,input().strip().split())
arr = np.ndarray(shape=(n,m),dtype=np.int32)
for i in range(n):
    row = list(map(int,input().strip().split()))
    arr[i,:] = row
    
trans = np.transpose(arr)
flat = arr.flatten()

print(trans)
print(flat)