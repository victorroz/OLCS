#include <iostream>
using namespace std;

void newFunc() 
{
    cout << "newFunc() executed" << endl;
}

int addFunc()
{
    int x = 1+2;

    return x;
}

int main()
{
    newFunc();
    
    int var = addFunc();

    cout << var;
    
    return 0;
}