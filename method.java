import java.util.*;

// public class array {
//     private static Scanner in;
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         int[] odd = new int[10];
//         int[] even = new int[10];

//         for (int i = 0; i < even.length; i++) {
//             System.out.print("Enter the  number: ");

//         }
//     }
// }

/**
 * array
 */
// public class array {

//     private static Scanner in;

// public static void main(String[] args) {
//     int num, sum = 0;
//     in = new Scanner(System.in);
//     System.out.print("Enter the numbre to see whether the number is armstrong number: \n");
//     System.out.print("Enter the number: ");
//     num = in.nextInt();
//     for (int i = 1; i < num; i++) {
//         if (num % i == 0) {
//             sum += i;
//         }
//     }
//     if (sum == num) {
//         System.out.print(num + " is an armstrong number.");
//     } else {
//         System.out.print(num + " is not an armstrong number.");
//     }
//     System.out.print("\n");
// }

// }

/**
 * array
 */
// public class array {

//     private static Scanner in;

//     public static void main(String[] args) {
//         int num,count = 1;
//         in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         num = in.nextInt();
//         for (int i = 1; i <= num; i++) {
//             System.out.printf("%-6d", pantagonalNumber(i));
//             if (count % 10 == 0) {
//                 System.out.println();
//             }
//             count++;
//         }
//     }

//     public static int pantagonalNumber(int i)
//     {
//         return (i * (3 * i - 1)) / 2;
//     }
// }

/**
 * array
 */
// public class method {

//     private static Scanner in;

//     public static void main(String[] args) {
//         int year;
//         in = new Scanner(System.in);
//         System.out.print("\nEnter the year: ");
//         year = in.nextInt();
//         if (checkLeapYear(year) == true) {
//             System.out.printf("%d is a leap year.", year);
//         } else {
//             System.out.printf("%d is not a leap year.", year);
//         }
//         System.out.println();
//     }
//     public static boolean checkLeapYear(int year) {
//         if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

/**
 * method
 */
// public class method {

//     private static Scanner in;

//     public static void main(String[] args) {
//         int num;
//         in = new Scanner(System.in);
//         System.out.print("Enter the number that you want to end: ");
//         num = in.nextInt();
//         for (int i = 0; i <= num; i++) {
//             if (odd(i) == true) {
//                 System.out.printf("%d ", i);
//             } else {
//                 continue;
//             }
//         }
//     }
//     public static boolean odd(int num) {
//         if (num % 2 != 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

/**
 * method
 */
// public class method {

//     private static Scanner in;

//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int num;
//         System.out.print("Enter the number: ");
//         num = in.nextInt();
//         if (perfect(num) == true) {
//             System.out.printf("%d is a perfect number.\n", num);
//         } else {
//             System.out.printf("%d is not a perfect number.\n", num);
//         }
//     }

//     public static boolean perfect(int num) {
//         int sum = 0, re;
//         re = num;
//         for (int i = 1; i < num; i++) {
//             if (re % i == 0) {
//                 sum += i;
//             }
//         }
//         if (sum == num) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

/**
 * method
 */
// public class method {

//     private static Scanner in;
//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int num,n1 = 2,n2=1,n3;
//         System.out.printf("Enter the number: ");
//         num = in.nextInt();
//         System.out.printf("%d %d ", n1, n2);
//         if (num > 1) {
//             for (int i = 2; i < num; i++) {
//                 n3 = n2;
//                 n2 += n1;
//                 n1 = n3;
//                 System.out.printf("%d ", n2);
//             }
//         } else if (num == 1) {
//             System.out.printf("%d ", n1);
//         } else {
//             System.out.print("Input the positive number that greater than 0 !!!!");
//         }
//     }
// }

/**
 * method
 */
// public class method {
// // find catalen number using recursive in java
//     int catalan(int i) {
//         int res = 0;
//         if (i <= 1) {//base 
//             return 1;
//         }
//         for (int j = 0; j < i; j++) {
//                 res += catalan(j) * catalan(i - j - 1);
//             }
//             return res;
//     }

//     private static Scanner in;
//     public static void main(String[] args) {
//         int num;
//         method md = new method();
//         in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         num = in.nextInt();
//         for (int i = 0; i < num; i++) {
//             System.out.print(md.catalan(i) + " ");
//         }
//     }
// }

/**
 * method
 */
// write java to output happy number.
// public class method {

//     public static Scanner in;
//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         long num;
//         System.out.print("Enter the number: ");
//         num = in.nextInt();
//         System.out.printf("The %d of the happy number: ", num);
//         for (int i = 0; i <= num; i++) {
            
//         }
//     }
// }
/**
 * method
 */
// public class method {

    
//     //Utility method to return sum of square of

//     // digit of n
//     static int numSquareSum(int n) {
//         int squareSum = 0;
//         while (n != 0) {
//             squareSum += (n % 10) * (n % 10);
//             n /= 10;
//         }
//         return squareSum;
//     }

//     // method return true if n is Happy number
//     static boolean isHappynumber(int n) {
//         int slow, fast;

//         // initialize slow and fast by n
//         slow = fast = n;
//         do {
//             // move slow number
//             // by one iteration
//             slow = numSquareSum(slow);

//             // move fast number
//             // by two iteration
//             fast = numSquareSum(numSquareSum(fast));

//         } while (slow != fast);

//         // if both number meet at 1,
//         // then return true
//         return (slow == 1);
//     }

//     // Driver code to test above methods
//     private static Scanner in;
//     public static void main(String[] args) {
//         int n;
//         in = new Scanner(System.in);
//         System.out.print("Enter the total number: ");
//         n = in.nextInt();
//         if (isHappynumber(n))
//             System.out.println(n + " is a Happy number");
//         else
//             System.out.println(n + " is not a Happy number");
//     }
// }
