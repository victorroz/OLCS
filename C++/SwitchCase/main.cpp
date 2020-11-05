#include <iostream>
#include <string>
using namespace std;

int main()
{
    char rank = 't';

    switch(rank)
    {
        case 'o':
            cout << "C++";
            break;
        case 't':
            cout << "Java";
            break;
        default:
            cout << "Case doesnt match..";
    }
}
