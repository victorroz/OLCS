'''
Basic Calculator with advance features
'''

# function for taking user inputs
def user_inputs():
    value_1 = float(input("Value 1: "))
    value_2 = float(input("Value 2: "))
    operation = input("Operation: ")
    decision_maker(value_1, value_2, operation)

# function for adding two numbers
def summation(value_1, value_2):
    print(value_1 + value_2)
    continuer_function()

# function for adding two numbers
def subtraction(value_1, value_2):
    print(value_1 - value_2)
    continuer_function()

# function for adding two numbers
def multiplication(value_1, value_2):
    print(value_1 * value_2)
    continuer_function()

# function for adding two numbers
def division(value_1, value_2):
    print(value_1 / value_2)
    continuer_function()

# function for making calculation decisions
def decision_maker(value_1, value_2, operation):
    if (operation == "+"):
        summation(value_1, value_2)

    elif (operation == "-"):
        subtraction(value_1, value_2)

    elif (operation == "*"):
        multiplication(value_1, value_2)

    elif (operation == "/"):
        division(value_1, value_2)

    else:
        print("\nWrong operation input!")
        continuer_function()
        
# function for looping
def continuer_function():
    continuer = input("\nDo you want to continue? (y/n): ")
    if (continuer == "y"):
        user_inputs()
    else:
        exit()

# program initiator
user_inputs()