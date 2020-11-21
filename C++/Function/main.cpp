#include <iostream>
using namespace std;

// Non-parameterized Functions
void newFunc() 
{
    cout << "newFunc() executed" << endl;
}

int addFunc()
{
    int x = 1+2;

    return x;
}

// Parameterized Functions
void printName(string name)
{
    cout << "My name is: " << name;
}

// Default Parameters
double recArea(double length=1, double width=1)
{
    return length * width;
}

void personalTraits(string firstName, int age, string hairColor="Black")
{
    cout << firstName << endl;
    cout << age << endl;
    cout << hairColor << endl;   
}

// Function Overloading
double add(double a, double b)
{
    cout << "Double Parameter" << endl;
    return a + b;
}

int add(int a, int b)
{
    cout << "Int Parameter" << endl;
    return a + b;
}

int main()
{
    // newFunc();
    
    // int var = addFunc();

    // cout << var;

    // printName("Victor");

    // cout << "The result is: " << add(1.1, 2.999);

    // cout << "The result is: " << recArea(2);

    // personalTraits("Victor", 24, "Brown");\

    cout << add(1,2);
    
    return 0;
}