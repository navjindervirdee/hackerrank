from collections import namedtuple
n = int(input())
columns = input().split()
Student = namedtuple('Student',columns)
Students = list()
for i in range(n):
    l = input().split()
    student = Student(l[0],l[1],l[2],[3])
    Students.append(student)

sum = 0;
for student in Students:
    sum = int(student.MARKS) + sum
print(sum/len(Students))
    