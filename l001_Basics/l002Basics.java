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
    /*
     Note - '/' this means Divide , means Qotient, and this is used [ jab number ko chotta krna ho ]
     '%' this is modulus, last digit find krke deta hai
     */
    int count = 0;

    while (n != 0) {
      n = n / 10; // basically jo qotient aayega usko again divide krege, jab tak vo 0 ni hojaye
      // / ye krne se last digit kam hogyi and number ko save krliya
      count++;
      /*
             Doubt -> isme % krke kyu nai kiya;  because last digit dega , agar test case 10000 hoga to 
             har bar 0 dega and condition kese lgaege
            */
    }
    return count;
  }

  // Q9)
  public static void printDigitsOfNumber(int n) {
    /*
     * Note -> jitne 10 ki power se number ko divide (/) krege utne number kam honge "piche se"
     */
    int nod = countDigits(n);
    int divisor = (int) Math.pow(10, nod - 1); // Java Khud se type casting nahi krti

    while (divisor != 0) {
      int qotient = n / divisor;
      int rem = n % divisor; // isme first digit ko chorh kar sari digit rehti hai
      System.out.print(qotient + " ");

      n = rem;
      divisor /= 10; // 10^3 then 10^2 then 10^1 ....
    }
  }

  // Q10)
  public static void printNumberInReverseOrder(int n) { // 3125
    // Now we want last digit vo milti hai "% (Modulus) se"
    while (n > 0) { // number jab tak 0 nahi hota ya fir number > 0 h
      int lastDigit = n % 10;
      System.out.print(lastDigit + " ");
      // Now we get the last digit and now ab number ko chota krege
      n /= 10;
    }
  }

  // Q11) 
  public static int reverseNumber(int n) {
    int ans = 0;
    while (n > 0) {
      int lastDigit = n % 10;
      n /= 10;
      ans = ans * 10 + lastDigit;

    }
    return ans;
  }


  public static void main(String[] args) {
    // printZ();
    int n = scn.nextInt();
    // gradingSystem(n);
    // oddEven(n);
    // primeNumber();
    // printPrimeTill(2, 10);
    // fibonacciSeries(n);
    // System.out.println(countDigits(n));
    // printDigitsOfNumber(n);
    // printNumberInReverseOrder(12345);

    System.out.println(reverseNumber(n));
  }
}
