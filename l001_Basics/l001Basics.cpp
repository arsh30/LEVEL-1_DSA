#include <iostream>
using namespace std;

int mult(int a, int b)
{
    return a * b;
}

void add(int a, int b)
{
    int c = a + b;
    cout << c << endl;
}

int subtract(int a, int b)
{
    return a - b;
}

int divide(int a, int b)
{
    return a / b;
}

int main()
{
    cout << "Hello ";
    cout << "Arsh " << endl;
    // Agr 1 next line print krni hai to endl lgayege otherwise 1 hi line me aata jaega
    cout << "coder " << endl;

    // FUNCTIONS......
    int a, b; // Taking input from users
    cin >> a >> b;
    /*
        cout << a + b << endl;
        cout << a - b << endl;
        cout << a * b << endl;
        cout << a / b << endl;
        cout << a + b << endl; // Again + wale ka logic likhre hai, so better to make a function
    */

    int ans = mult(a, b); // return krra tha isliye 1 variable me catch krra, and usko print kra
    cout << ans << endl;

    add(a, b) ; // coz kuch return ni krra, direct call
    cout << divide(a, b) << endl; // 2nd way, agr kisi variable me catch nai krna toh
    cout << subtract(a, b) << endl;

    return 0;
}