from collections import OrderedDict
ordered_dict = OrderedDict()
d_price = dict()
import re
n = int(input())
for i in range(n):
    str = input().strip()
    numindex = re.search('\d',str)
    numindex = numindex.start()
    item = str[0:numindex-1]
    price = int(str[numindex:])
    ordered_dict[item] = price
    if(item in d_price):
        d_price[item] = d_price[item] + price
    else:
        d_price[item] = price
   
for item in ordered_dict:
    print(item + " %d"%d_price[item])
            