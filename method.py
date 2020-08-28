#create a recursive for catalan
def catalan(n):
    res = 0
    if n <= 1: # base condition
        return 1
    else:
        for i in range(n):
            res = res + (catalan(i)*catalan(n-i-1))
        return res
# main function that take input from user
num = int(input("Enter the number: "))
for i in range(num):
    print(catalan(i),end = " ")