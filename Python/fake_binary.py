"""
Given a string of digits, you should replace any digit below 5 with ‘0’ and any digit 5 and above with ‘1’. 
Return the resulting string.
"""

# take a string of digits from the user
string_of_digits = input("Enter digits: ")

# initializing variables for later use
i = 0 # for looping through the while loop
new_string = "" # for storing the fake binary numbers

# used for checking whether each element
while (i < len(string_of_digits)):
    if (int(string_of_digits[i]) < 5):
        new_string += "0"
    elif (int(string_of_digits[i]) >= 5):
        new_string += "1"
    
    i += 1

print(new_string) # printing the new string