from operator import itemgetter
if __name__ == '__main__':
    l = list()
    for _ in range(int(input())):
        name = input()
        score = float(input())
        temp = [name,score]
        l.append(temp)
    l.sort(key = itemgetter(1))
    min = 0
    for i in range(0,len(l)-1):
        row1 = float(l[i][1])
        row2 = float(l[i+1][1])
        if(row1<row2):
            min = row2
            break
    names = [x  for x in l if x[1]==min]
    names.sort()
    for row in names:
        print(row[0])
        
