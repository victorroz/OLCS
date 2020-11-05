#include <iostream>
#include <string>
using namespace std;

int main()
{
    string carModel;
    int carYear;
    string carColor;
    bool isFourWheelDrive;

    cout << "Input Car Model: ";
    cin >> carModel;

    cout << "Input Car Year: ";
    cin >> carYear;

    cout << "Input Car Color: ";
    cin >> carColor;

    cout << "Is the car four wheel drive? ";
    cin >> isFourWheelDrive;

    cout << "Car Model: " << carModel << endl;
    cout << "Car Year: " << carYear << endl;
    cout << "Car Color: " << carColor << endl;
    cout << "Is car four wheel drive? " << isFourWheelDrive << endl;

    return 0;
}