#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> a;
    int vSize;
    cin >> vSize;

    for(int i = 0; i < vSize; i++)
    {
        int x;
        cin >> x;
        a.push_back(x);
    }

    cout << "\nSize of the vector: " << a.size() << endl;

    for(int i = 0; i < vSize; i++)
    {
        cout << a[i] << endl;
    }

    return 0;
}