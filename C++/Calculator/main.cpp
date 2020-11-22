#include <iostream>
using namespace std;

double add(double v1, double v2)
{
    return v1 + v2;
}

double sub(double v1, double v2)
{
    return v1 - v2;
}

double mul(double v1, double v2)
{
    return v1 * v2;
}

double div(double v1, double v2)
{
    return v1 / v2;
}

int main()
{
    double val1, val2;
    char op;

    cout << "Value 1: ";
    cin >> val1;

    cout << "Value 2: ";
    cin >> val2;

    cout << "Operation (+,-,*,/): ";
    cin >> op;

    switch(op)
    {
        case '+':
            cout << "Result: " << add(val1, val2) << endl;
            break;
        
        case '-':
            cout << "Result: " << sub(val1, val2) << endl;
            break;
        
        case '*':
            cout << "Result: " << mul(val1, val2) << endl;
            break;
        
        case '/':
            cout << "Result: " << div(val1, val2) << endl;
            break;
        
        default:
            cout << "Invalid Operator!!" << endl;
            break;
    }

    return 0;
}