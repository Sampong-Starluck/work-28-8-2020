// import java.util.*;

//import jdk.jfr.Unsigned;

/**
 * test
 */
// public class test {

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int num;
    //     System.out.print("Enter the number: ");
    //     num = in.nextInt();
    //     System.out.print(num + " factorial is " + factorial(num));
    // }
    // public static int factorial(int num) {
    //     if (num > 1) {
    //         return factorial(num - 1) * num;
    //     } else {
    //         return 1;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int num, n, i = 1;
    //     while (i != 0) {
    //         System.out.print("1.Factorial.\n");
    //         System.out.print("2.Power.\n");
    //         System.out.print("3.sumSuit.\n");
    //         System.out.print("4.sumSquare.\n");
    //         System.out.print("5.count digit.\n");
    //         System.out.print("Input your option: ");
    //         n = in.nextInt();
    //         System.out.print("Enter the number: ");
    //         num = in.nextInt();
    //         switch (n) {
    //             case 1:
    //                 System.out.print(num + " factorial is " + factorial(num) + "\n\n");
    //                 break;
    //             case 2:
    //                 int p;
    //                 System.out.print("Enter the power that you want to raise: ");
    //                 p = in.nextInt();
    //                 System.out.print(num + " raise to the power of " + p + " equal to " + power(num, p) + "\n\n");
    //                 break;
    //             case 3:
    //                 System.out.print("The suit summation from 1 to " + num + " is " + sumSuit(num) + "\n\n");
    //                 break;
    //             case 4:
    //                 System.out.print("The square summation from 1 to " + num + " is " + sumSquare(num) + "\n\n");
    //                 break;
    //             case 5:
    //                 System.out.print(num + " has " + countDigit(num) + " digit(s)." + "\n\n");
    //                 break;
    //             default:
    //                 System.out.print("Your input is invalid !!!!!");
    //                 break;
    //         }
    //     }
    // }

    // public static int factorial(int num) {
    //     if (num > 1) {
    //         return factorial(num - 1) * num;
    //     } else {
    //         return 1;
    //     }
    // }

    // public static int power(int num, int p) {
    //     if (p > 0) {
    //         return power(num, p - 1) * num;
    //     } else {
    //         return 1;
    //     }
    // }

    // public static int sumSuit(int num) {
    //     if (num > 0) {
    //         return sumSuit(num - 1) + num;
    //     } else {
    //         return 0;
    //     }
    // }

    // public static int sumSquare(int num) {
    //     if (num > 0) {
    //         return sumSquare(num - 1) + (num * num);
    //     } else {
    //         return 0;
    //     }
    // }

    // public static int countDigit(int num) {

    //     if (num < 10) {
    //         return 1;
    //     } else {
    //         return 1 + countDigit(num / 10);
    //     }
    // }
    
// }

/**
 * test
 */
// public class test {

//     public static void main(String[] args) {
//         int n;
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         n = in.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         sumarr(arr, n);
//     }

//     public static void sumarr(int[] arr, int size) {
//         int sum = 0;
//         for (int i = 0; i < size; i++) {
//             sum += arr[i];
//         }
//         System.out.print("The summation is " + sum);
//     }
// }

/**
 * test
 */
// public class test {
//     private static Scanner in;
//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int n, min, max;
//         System.out.print("Enter the size of array: ");
//         n = in.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         min = arr[0];
//         max = arr[0];
//         for (int i = 0; i < n; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//             }
//             if (min > arr[i]) {
//                 min = arr[i];
//             }
//         }
//         System.out.print("In array, the maximum number is " + max + " and the minimum number is " + min);
//     }
// }

/**
 * test
 */
// public class test {
//     private static Scanner in;
//     public static void main(String[] args) {
//         int[] arr = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
//         in = new Scanner(System.in);
//         int num;
//         System.out.print("Enter the number that you want to search: ");
//         num = in.nextInt();
//         if (contain(arr, num) == true) {
//             System.out.print("The number that you search for is contain in this array.");
//         } else {
//             System.out.print("The number that you search for is not contain in this array.");
//         }
//     }
//     public static boolean contain(int[] arr,int item) {
//         for (int i : arr) {
//             if (item == i) {
//                 return true;
//             }
//         }
//         return false;
//     }
    
// }

/**
 * test
 */
// public class test {
//     private static Scanner in;
//     public static void main(String[] args) {
//         in = new Scanner(System.in);
//         int n;
//         System.out.print("Enter the size of array: ");
//         n = in.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter the number: ");
//             arr[i] = in.nextInt();
//         }
//         System.out.print("The element is array: " + arr);
//     }
// }

/**
 * test
 */
// public class test {
//     private static Scanner in;
//     public static void main(String[] args) {
//         String str;
//         in = new Scanner(System.in);
//         System.out.print("Enter the character or number: ");
//         str = in.nextLine();
//         if (str.charAt(0) >= 48 && str.charAt(0) <= 57) {
//             System.out.print(str.charAt(0)+" is a number.\n");
//         } else if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
//             if (str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O'
//                     || str.charAt(0) == 'U') {
//                 System.out.print(str.charAt(0) + " is a vowel in uppercase.\n");
//             } else {
//                 System.out.print(str.charAt(0) + " is a consonant in uppercase.\n");
//             }
//         } else if (str.charAt(0) >= 97 && str.charAt(0) <= 122) {
//             if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
//                     || str.charAt(0) == 'u') {
//                 System.out.print(str.charAt(0) + " is a vowel in lowercase.\n");
//             } else {
//                 System.out.print(str.charAt(0) + " is a consonant in lowercase.\n");
//             }
//         } else {
//             System.out.print(str.charAt(0) + " is a symbol.\n");
//         }
//     }
// }

/**
 * test
 */
// public class test {

//     private static Scanner in;

//     public static void main(String[] args) {
//         int num;
//         in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         num = in.nextInt();
//         System.out.print("The summation of digits is " + sumDigit(num));
//     }
//     public static int sumDigit(int num) {
//         if (num == 0) {
//             return 0;
//         }
//         return (num % 10 + sumDigit(num / 10));
//     }
// }

/**
 * test
 */
// public class test {

//     private static Scanner in;

//     public static void main(String[] args) {
//         int n1, n2, n3;
//         in = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         n1 = in.nextInt();
//         System.out.print("Enter the second number: ");
//         n2 = in.nextInt();
//         System.out.print("Enter the third number: ");
//         n3 = in.nextInt();
//         average(n1, n2, n3);
//     }
//     public static void average(int a,int b,int c) {
//         System.out.print("The summation is " + (a + b + c) + " and the average is " + (a + b + c) / 3);
//     }
// }