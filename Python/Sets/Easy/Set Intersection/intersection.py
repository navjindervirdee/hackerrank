# Enter your code here. Read input from STDIN. Print output to STDOUT
n = input()
a = set(raw_input().strip().split(" "))
m = input()
b = set(raw_input().strip().split(" "))
print(len(a.intersection(b)))
