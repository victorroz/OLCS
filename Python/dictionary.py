time_schedule = {
    "8-9" : "Have Breakfast",
    "9-10" : "First Period Class"
}

# user inputs
# day (sunday, monday,...)
# time (11-12)

# print(time_schedule["8PM"])

time_schedule["8-9"] = "Snorrrrre"

for key, value in time_schedule.items():
    print(key + " : " + value)