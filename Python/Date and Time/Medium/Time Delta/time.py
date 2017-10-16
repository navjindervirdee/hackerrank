#!/bin/python3
from datetime import datetime as dt
import sys

def time_delta(t1, t2):
    fmt = '%a %d %b %Y %H:%M:%S %z'
    return int(abs((dt.strptime(t1, fmt)-dt.strptime(t2, fmt)).total_seconds()))
     
if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        t1 = input().strip()
        t2 = input().strip()
        delta = time_delta(t1, t2)
        print(delta)
