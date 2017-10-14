#!/bin/python3

import sys
from collections import Counter, OrderedDict
if __name__ == "__main__":
    s = sorted(input().strip())
    c = Counter(s)
    c = sorted(c.items(), key = lambda x : (-x[1],x[0]))[0:3]
    for i in c:
        print(i[0] + " " + str(i[1]))
    
    
    
        
       
    
    
