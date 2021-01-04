#include <iostream>
#include <string>
using namespace std;

class HotPink
{
    private:
        string name;
        int age;

    public:
        HotPink(string n, int a)
        {
            name = n;
            age = a;
        }

        void info()
        {
            cout << name << " " << age;
        }
};


int main()
{
    HotPink hp1("OLCS", 10); 

    hp1.info();

    return 0;
}