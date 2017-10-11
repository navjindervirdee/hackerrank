import math
ab = float(input())
bc = float(input())

c = float(ab/bc)
acb = round(math.degrees(math.atan2(ab,bc)))
d = '\u00b0'
acb = str(acb)
print(acb + '°')


