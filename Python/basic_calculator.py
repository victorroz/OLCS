operand1 = int(input("Value 1: "))
operand2 = int(input("Value 2: "))
operator = input("Please enter an operator: ")

if operator == "+":
    print(operand1 + operand2)
elif operator == "-":
    print(operand1 - operand2)
elif operator == "*":
    print(operand1 * operand2)
elif operator == "/":
    print(operand1 / operand2)
else: 
    print("Invalid operator.")