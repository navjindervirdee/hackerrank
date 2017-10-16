import datetime as dt
import calendar
date = list(map(int,input().strip().split()))
print(calendar.day_name[dt.date(date[2],date[0],date[1]).weekday()].upper())