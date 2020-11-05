"""
Task 1: sleep_in
A function sleep_in takes is two parameters, weekday and vacation. 
The parameter weekday is True if it is a weekday, and the parameter vacation is True if we are on vacation. 
We sleep in if it is not a weekday or we’re on vacation. 
Return True if we sleep in.

    sleep_in(False, False) → True
    sleep_in(True, False) → False
    sleep_in(False, True) → True
"""

# weekday = 0
# vacation = 1

# def sleep_in(w, v):
#     return True if not w or v else False

#     # if not w or v:
#     #     return True
#     # else:
#     #     return False

# print(sleep_in(weekday, vacation))



"""
Task 2: monkey_trouble
Define a function monkey_trouble which has two parameters. 
We have two monkeys, a and b, and the parameters a_smile and b_smile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them are smiling. 
Return True if we are in trouble.

    monkey_trouble(True, True) → True
    monkey_trouble(False, False) → True
    monkey_trouble(True, False) → False
"""

# a_smile = False
# b_smile = False

# def monkey_trouble(a, b):
#     if a and b:
#         return True
#     elif not a and b:
#         return True
#     return False

# print(monkey_trouble(a_smile, b_smile))



"""
Task 3: sum_double
Given two integer values, return their sum. 
If the two values are the same, then return double their sum.

    sum_double(1, 2) → 3
    sum_double(3, 2) → 5
    sum_double(2, 2) → 8
"""

# value_input_1 = 3
# value_input_2 = 2

# def sum_double(value_1, value_2):
#     sum = value_1 + value_2

#     if value_1 == value_2:
#         return sum * 2
#     return sum

# print(sum_double(value_input_1, value_input_2))



"""
Task 4: diff21
Given an integer n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
"""

# n_input = 41

# def diff21(n):
#     if n <= 21:
#         return 21 - n 
#     else:
#         return (n - 21) * 2

# print(diff21(n_input))        



"""
Task 5:
We have a loud talking parrot. 
The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return True if we are in trouble.

    parrot_trouble(True, 6) → True
    parrot_trouble(True, 7) → False
    parrot_trouble(False, 6) → False
"""

# talking = True
# hour = 6

# def parrot_trouble(t, h):
#     if t and (h < 7 or h > 20):
#         return True
#     else:
#         return False

# print(parrot_trouble(talking, hour))

