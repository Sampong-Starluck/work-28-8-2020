#include <iostream>
#include <stdlib.h>
#include <conio.h>

using namespace std;

// int factorial(int);
// int power(int, int);
// int sumSuit(int);
// int sumSquare(int);
// int countDigit(int);

// int main()
// {
//     int num, i = 1, n;
//     while (i != 0)
//     {
//         cout << "Enter the number: ";
//         cin >> num;
//         cout << "1.factorial." << endl;
//         cout << "2.power." << endl;
//         cout << "3.sumSuit." << endl;
//         cout << "4.sumSquare." << endl;
//         cout << "5.countDigit." << endl;
//         cout << "Enter your option: ";
//         cin >> n;
//         switch (n)
//         {
//         case 1:
//             cout << num << " factorial is: " << factorial(num) << endl;
//             break;
//         case 2:
//             int p;
//             cout << "Enter the power that you want to raise: ";
//             cin >> p;
//             cout << num << " raise to the power of " << p << " is equal " << power(num, p) << endl;
//             break;
//         case 3:
//             cout << "Sum suit from 1 to " << num << " is " << sumSuit(num) << endl;
//             break;
//         case 4:
//             cout << "Sum square from 1 to " << num << " is " << sumSquare(num) << endl;
//             break;
//         case 5:
//             cout << num << " has " << countDigit(num) << " digits" << endl;
//             break;
//         default:
//             cout << "Your input is invalid !!!!!" << endl;
//             break;
//         }
//     }
// }
// int factorial(int num)
// {
//     if (num > 1)
//     {
//         return factorial(num - 1) * num;
//     }
//     else
//     {
//         return 1;
//     }
// }
// int power(int num, int p)
// {
//     if (p == 0)
//     {
//         return 1;
//     }
//     else
//     {
//         return power(num, p - 1) * num;
//     }
// }
// int sumSuit(int num)
// {
//     if (num > 0)
//     {
//         return sumSuit(num - 1) + num;
//     }
//     else
//     {
//         return 0;
//     }
// }
// int sumSquare(int num)
// {
//     if (num > 0)
//     {
//         return sumSquare(num - 1) + (num * num);
//     }
//     else
//     {
//         return 0;
//     }
// }
// int countDigit(int num)
// {
//     static int count = 0;
//     if (num != 0)
//     {
//         count++;
//         return countDigit(num / 10);
//     }
//     else
//     {
//         return count;
//     }
// }

unsigned long int catalan(long int j)
{
    unsigned long int res = 0;
    if (j <= 1)
    {
        return 1;
    }
    else
    {
        for (int i = 0; i < j; i++)
        {
            res += catalan(i) * catalan(j - i - 1);
        }
        return res;
    }
    
}
int main()
{
    int num;
    cout << "Enter the number: ";
    cin >> num;
    for (int i = 0; i < num; i++)
    {
        cout << catalan(i) << " ";
    }
    
}