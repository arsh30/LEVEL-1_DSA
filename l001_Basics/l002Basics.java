import java.util.Scanner;

public class l002Basics {

  public static Scanner scn = new Scanner(System.in);

  // Q1)
  public static void printZ() {
    System.out.println("*****");
    System.out.println("   *");
    System.out.println("  *");
    System.out.println(" *");
    System.out.println("*****");
  }

  // Q2)
  public static void gradingSystem(int marks) {
    if (marks > 90) {
      System.out.println("excellent");
    } else if (marks > 80 && marks <= 90) {
      System.out.println("good");
    } else if (marks > 70 && marks <= 80) {
      System.out.println("fair");
    } else if (marks > 60 && marks <= 70) {
      System.out.println("meets expectations");
    } else {
      System.out.println("below par");
    }
  }

  // Class 2 -> loops
  public static void printNTimes(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println("Hello");
    }
    System.out.println();
  }

  // Q2)
  public static void printTableofN(int n) {
    for (int i = 1; i <= 10; i++) {
      // cout << n << " X " << i << " = " << n * i << endl;

      System.out.println((n) + " X " + (i) + " = " + (n * i));
      // try to use this 2nd way because hame generally string return krne ke liye bolte hai
    }
    System.out.println();
  }

  // Q3)
  public static void printTableNTimes(int n) {
    for (int i = 1; i <= n; i++) {
      printTableofN(i);
    }
    System.out.println();
  }

  // Q4)
  public static void oddEven(int n) {
    if (n % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }

  // Q5)
  public static boolean isPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }
    /*
     * 2 is only even prime number
     * prime number are natural numbers between 2 to n - 1; either it is divisble by 1  or number itself
     *
     */
    return true;
  }

  public static void primeNumber() {
    int t = scn.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = scn.nextInt();
      if (isPrime(n)) {
        System.out.println(n + " - " + "Number is prime");
      } else {
        System.out.println(n + " - " + "Number is Not prime");
      }
    }
  }

  // Q6
  public static void printPrimeTill(int low, int high) {
    for (int i = low; i <= high; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  // Q7
  public static void fibonacciSeries(int n) {
    int a = 0, b = 1;
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");

      int c = a + b;
      a = b;
      b = c;
    }
  }

  // Q8
  public static int countDigits(int n) {
    
  }

  public static void main(String[] args) {
    // printZ();
    int n = scn.nextInt();
    // gradingSystem(n);
    // oddEven(n);
    // primeNumber();
    // printPrimeTill(2, 10);
    fibonacciSeries(n);
  }
}
