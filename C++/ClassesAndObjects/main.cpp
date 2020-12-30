#include <iostream>
#include <string>
using namespace std;

class Animal
{
    // Properties
    public:
        string name;
        int legs;
        string color;

    // Methods
    public:
        void info()
        {
            cout << "Object Name: " << name << endl;
            cout << "Number of legs: " << legs << endl;
            cout << "Skin Color: " << color << endl;
        }

        void walking()
        {
            cout << name << " is walking.."<< endl;
        }

        void eating()
        {
            cout << name << " is eating..."<< endl;
        }
};


int main()
{
    Animal dog;

    dog.name = "German Shephard";
    dog.legs = 4;
    dog.color = "Golden";

    dog.info();

    dog.walking();
    dog.eating();

    cout << endl;

    Animal cat;

    cat.name = "Kitty";
    cat.legs = 3;
    cat.color = "White";

    cat.info();
    cat.eating();

    return 0;
}