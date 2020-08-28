#include <stdio.h>
#include <stdlib.h>

int factorial(int);
int power(int, int);
int sumSuit(int);
int sumSquare(int);
int countDigit(int);

int main() {
    int num, i = 1, n,p;
    while (i != 0)
    {
        printf("Enter the number: ");
        scanf("%d", &num);
        printf("1.factorial.\n");
        printf("2.power.\n");
        printf("3.sumSuit.\n");
        printf("4.sumSquare.\n");
        printf("5.countDigit.\n");
        printf("Enter your option: ");
        scanf("%d", &n);
        switch(n){
        {
            case 1:
                printf("%d factorial is %d.\n", num, factorial(num));
                break;
            case 2:
                printf("Enter the power that you want to raise: ");
                scanf("%d", &p);
                printf("%d riase to the power of %d is %d.\n", num, p, power(num, p));
                break;
            case 3:
                printf("The summation from 1 to %d is %d.\n", num, sumSuit(num));
                break;
            case 4:
                printf("The square summation from 1 to %d is %d.\n", num, sumSquare(num));
                break;
            case 5:
                printf("%d has %d digit(s).\n", num, countDigit(num));
                break;
            default:
                printf("Your input is invalid !!!!!!\n");
                break;
            }
        }
        printf("\n");
        i++;
    }
}
int factorial(int a)
{
    if (a > 1)
    {
        return factorial(a - 1) * a;
    }
    else
    {
        return 1;
    }
}
int power(int a,int p)
{
    if (p != 0)
    {
        return power(a, p - 1) * a;
    }
    else
    {
        return 1;
    }
}
int sumSuit(int a) {
    if (a > 0)
    {
        return sumSuit(a - 1) + a;
    }
    else
    {
        return 0;
    }
}
int sumSquare(int a) {
    if(a > 0)
    {
        return sumSquare(a - 1) + (a * a);
    }else
    {
        return 0;
    }
}
int countDigit(int num) {
    static int count = 0;
    if(num != 0)
    {
        count++;
        return countDigit(num / 10);
    }else
    {
        return count;
    }
}