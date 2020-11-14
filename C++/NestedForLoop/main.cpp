#include <iostream>
using namespace std;

int main()
{
    int row = 4, col = 5;

    // Working Principle
    // for(row = 0; row < 4; row++)
    // {
    //     for(col = 0; col < 5; col++)
    //     {
    //         cout << row << "," << col << "\t";
    //     }

    //     cout << endl;
    // }

    // Right-angled triangle
    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j <= i; j++)
        {
            cout << "*";
        }
        cout << endl;
    }

    // Reversed right-angled triangle
    for(int i = row; i > 0; i--)
    {
        for(int j = i; j > 0; j--)
        {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}