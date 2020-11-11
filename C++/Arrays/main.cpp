#include <iostream>
#include <string>

using namespace std;

int main()
{
    // Array Intro
    // string pcComponents[5] = {"CPU", "RAM", "GPU"};

    // pcComponents[0] = "Mainboard";

    // cout << pcComponents[0];

    // pcComponents[4] = "LED";.
    

    // printing arrays
    // string games[5] = {"GTA V", "The Last of Us", "Fallen Orders", "Minecraft"};

    // cout << games[0] << endl;
    // cout << games[1] << endl;
    // cout << games[2] << endl;
    // cout << games[3] << endl;
    // cout << games[4] << endl;

    // int sizeOfGames = sizeof(games)/sizeof(games[0]);
    // for(int i = 0; i < sizeof(games)/sizeof(games[0]); i++)
    // {
    //     cout << i+1 << ". " << games[i] << endl;
    // }

    // taking input into arrays
    string country[6];

    for(int i = 0; i < 6; i++)
    {
        cout << "Enter country " << i+1 << ": ";
        cin >> country[i];
    }

    cout << "\n********Country List********" << endl;
    for(int i = 0; i < 6; i++)
    {
        cout << i+1 << ". " << country[i] << endl;
    }


    return 0;
}