def factorial(num):
    if num > 1:
        return factorial(num-1)*num
    else:
        return 1


def power(num, p):
    if p > 0:
        return power(num, p - 1) * num
    else:
        return 1


def sumSuit(num):
    if num > 0:
        return sumSuit(num - 1) + num
    else:
        return 0


def sumSquare(num):
    if num > 0:
        return (sumSquare(num - 1) + (num * num))
    else:
        return 0


def countDigit(num):
    if num == 0:
        return 0
    return 1 + countDigit(num // 10)

num = int(input("Enter the number: "))
print("1.factorial.")
print("2.power.")
print("3.sumSuit.")
print("4.sumSquare.")
print("5.countDigit.")
n = int(input("Enter your option: "))
if n == 1:
    print("%d factorial is %d." % (num, factorial(num)));
elif n == 2:
    p = int(input("Enter the power that you want to raise: "))
    res = power(num, p)
    print("%d raise to the power of %d is %d." % (num, p, res));
elif n == 3:
    print("The suit summation of %d is %d." % (num, sumSuit(num)));
elif n == 4:
    print("The square sumation of %d is %d." % (num, sumSquare(num)));
elif n == 5:
    print("%d has %d digit(s)." % (num, countDigit(num)));
else:
    print("Your input is invalid !!!!!!")
