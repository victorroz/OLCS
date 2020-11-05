vowels = ("aeiouAEIOU")

sentence = input("Write a sentence: ")

for char in vowels:
    sentence = sentence.replace(char, "")

print(sentence)
