"""
It’s the academic year’s end, fateful moment of your school report. 
The averages must be calculated. 
All the students come to you and entreat you to calculate their average of them. 
Easy! You just need to write a script.
Return the average of the given array rounded down to its nearest integer.
The array will never be empty.
"""

# initialize an empty array for storing marks
report = []

# ask the number of subjects from the user and convert it to integer
number_of_subjects = int(input("Enter number of subjects: "))

# variable initializations for later use
i = 0 # for looping through the while loop
total_marks = 0 # for storing the summed up marks 

# used for taking the marks for each subject
while (i < number_of_subjects):
    subject_marks = int(input(f"Subject {i+1}: "))
    report.append(subject_marks)
    i += 1

# used for adding all the marks in the array 
for each_subject in report:
    total_marks += each_subject

average_mark = total_marks / number_of_subjects # average mark calculation

# check for rounding numbers
if ((average_mark - int(average_mark)) < 0.5):
    print(f"Average: {int(average_mark)}")
elif ((average_mark - int(average_mark)) >= 0.5):
    print(f"Average: {int(average_mark) + 1}")

