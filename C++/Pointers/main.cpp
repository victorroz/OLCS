#include <iostream>
using namespace std;

int main()
{
    int x;

    x = 5;

    int *y;

    y = &x;

    cout << "x: " << x << endl;
    cout << "y: " << y << endl;
    cout << "*y: " << *y << endl;

    *y = 10;

    cout << "x: " << x << endl;

    return 0;
}