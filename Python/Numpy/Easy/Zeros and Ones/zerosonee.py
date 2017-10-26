import numpy as np
shape = tuple(map(int,input().strip().split()))
zeros = np.zeros(shape,dtype=np.int32)
ones = np.ones(shape,dtype=np.int32)
print(zeros)
print(ones)

