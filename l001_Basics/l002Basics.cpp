#include <iostream>
using namespace std;

// Q1)
void printZ()
{
    cout << "*****" << endl;
    cout << "   *" << endl;
    cout << "  *" << endl;
    cout << " *" << endl;
    cout << "*****" << endl;
}

// Q2)
void gradingSystem(int marks)
{
    if (marks > 90)
    {
        cout << "excellent" << endl;
    }
    else if (marks > 80 && marks <= 90)
    {
        cout << "good" << endl;
    }
    else if (marks > 70 && marks <= 80)
    {
        cout << "fair" << endl;
    }
    else if (marks > 60 && marks <= 70)
    {
        cout << "meets expectations" << endl;
    }
    else
    {
        cout << "below par" << endl;
    }
}

// Class 2 -> loops
void printNTimes(int n)
{
    for (int i = 1; i <= n; i++)
    {
        cout << "Hello" << endl;
    }
    cout << endl;
}

// Q2)
void printTableofN(int n)
{
    for (int i = 1; i <= 10; i++)
    {
        // cout << n << " X " << i << " = " << n * i << endl;

        cout << to_string(n) + " X " << to_string(i) << " = " << to_string(n * i) << endl;
        // try to use this 2nd way because hame generally string return krne ke liye bolte hai
    }
    cout << endl;
}

// Q3)
void printTableNTimes(int n)
{
    for (int i = 1; i <= n; i++)
    {
        printTableofN(i);
    }
    cout << endl;
}

// Q4)
void oddEven(int n)
{
    if (n % 2 == 0)
    {
        cout << to_string(n) + " -> Even " << endl;
    }
    else
    {
        cout << to_string(n) + " -> Odd " << endl;
    }
}

void checkNForOddEven(int n)
{
    for (int i = 1; i <= n; i++)
    {
        int a;
        cin >> a; // 15 input liya and 15 number aayege input m, 1 1 krke, and ha number k liye btana h odd h ya even
        oddEven(a);
    }
}

// Q5
bool isPrime(int n)
{
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
        // % it gives remainder value jo ik dum last me hoti h
            return false;
    }

    return true;
}

void primeNumbers()
{
    int t;
    cin >> t;

    for (int i = 1; i <= t; i++)
    {
        // t number ke liye input liye
        int n;
        cin >> n;

        if (isPrime(n))
        {
            cout << to_string(n) + "-> Prime " << endl;
        }
        else
        {
            cout << to_string(n) + "-> Not Prime " << endl;
        }
    }
}

// Q6

int main()
{
    /*
    int marks;
    cin >> marks;
    printZ();

    gradingSystem(marks);
    */

    // class 2
    // int n;
    // cin >> n;
    // printNTimes(n);
    // printTableofN(n);
    // printTableNTimes(n);
    // checkNForOddEven(n);

    primeNumbers();
}