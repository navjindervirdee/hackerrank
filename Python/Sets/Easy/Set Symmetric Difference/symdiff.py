n = input()
a = set(input().strip().split())
m = input()
b = set(input().strip().split())
print(len(a.symmetric_difference(b))) # symmetric _difference  = ^ i.e a^b