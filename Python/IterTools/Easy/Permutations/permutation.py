from itertools import permutations
string = input().strip().split(" ")
l = list(permutations(str(string[0]),int(string[1])))
sortedList = list()
sortedList = [''.join(i) for i in l]
sortedList = sorted(sortedList)

for i in sortedList:
    print(i)
    