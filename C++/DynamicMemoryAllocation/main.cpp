#include <iostream>
using namespace std;

int main()
{
    int size;
    int *ptr;

    cout << "Size: ";
    cin >> size;

    ptr = new int[size];

    for(int i = 0; i < size; i++)
    {
        cin >> ptr[i];
    }

    for(int i = 0; i < size; i++)
    {
        cout << ptr[i] << endl;
    }

    return 0;
}