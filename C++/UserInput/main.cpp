#include <iostream>
#include <string>
using namespace std;

int main()
{
    /*
    * Example 1
    */
    // string carModel;
    // int carYear;
    // string carColor;
    // bool isFourWheelDrive;

    // cout << "Input Car Model: ";
    // getline(cin, carModel);

    // cout << "Input Car Year: ";
    // cin >> carYear;

    // cout << "Input Car Color: ";
    // cin >> carColor;

    // cout << "Is the car four wheel drive? ";
    // cin >> isFourWheelDrive;

    // cout << "Car Model: " << carModel << endl;
    // cout << "Car Year: " << carYear << endl;
    // cout << "Car Color: " << carColor << endl;
    // cout << "Is car four wheel drive? " << isFourWheelDrive << endl;

    /*
    * Example 2
    */

    int noOfApples;
    string customerName;

    cout << "Enter number of apples: ";
    cin >> noOfApples;
    cin.ignore();

    cout << "Enter customer number: ";
    getline(cin, customerName);

    cout << "Apple count: " << noOfApples << endl;
    cout << "Customer name: " << customerName << endl;

    return 0;
}