n = int(input())
for i in range(n):
    a, b = map(str,input().strip().split())
    try:
        c = int(a)//int(b)
        print(c)
    except ZeroDivisionError as e:
        print("Error Code: " + 'integer division or modulo by zero')
    except ValueError as e:
        print("Error Code:",e)
    except  Exception as e:
        print("Error Code:",e)
        