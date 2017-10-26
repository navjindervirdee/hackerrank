import numpy
l = list(map(int,input().strip().split()))
arr = numpy.array(l).reshape(3,3)
print(arr)