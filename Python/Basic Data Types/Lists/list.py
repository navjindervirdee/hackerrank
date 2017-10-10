if __name__ == '__main__':
    N = int(input())
    l = list()
    for i in range(0,N):
        str  = input().strip().split(" ")
        if(str[0]=='insert'):
            l.insert(int(str[1]),int(str[2]))
            continue
        if(str[0] == 'print'):
            print(l)
            continue
        if(str[0]=='remove'):
            l.remove(int(str[1]))
            continue
        if(str[0]=='append'):
            l.append(int(str[1]))
            continue
        if(str[0]=='sort'):
            l.sort()
            continue
        if(str[0]=='pop'):
            l.pop()
            continue
        if(str[0]=='reverse'):
            l.reverse()
            continue
            
