#include <iostream>
using namespace std;

class Flower
{
    private:
        int numberOfPetals;
        string color;
        string secret;

    public:
        // Getter and Setter Methods
        void setNumberOfPetals(int n)
        {
            numberOfPetals = n;
        }

        int getNumberofPetals()
        {
            return numberOfPetals;
        }

        void setColor(string c)
        {
            color = c;
        } 

        string getColor()
        {
            return color;
        }       

        void setSecret(string s)
        {
            secret = s;
        }

        string getSecret()
        {
            return secret;
        }
};

int main()
{
    Flower f1[3];

    for(int i = 0; i < 3; i++)
    {
        string n;
        cin >> n;
        f1[i].setColor(n);
    } 

    for(int i = 0; i < 3; i++)
    {
        cout << f1[i].getColor() << endl;
    } 

    return 0;
}