import java.util.Scanner;

public class l001Basics {

  public static Scanner scn = new Scanner(System.in);

  public static int mult(int a, int b) {
    return a * b;
  }

  public static void add(int a, int b) {
    int c = a + b;
    System.out.println(c);
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {
    System.out.print("Hello ");
    System.out.println("coder"); // ln -> is used for next line, jo bhi next op hoga vo next line se chalu hoga

    System.out.println("Arsh");

    // Functions
    System.out.println(mult(3, 2));
    System.out.println(subtract(3, 2));
    System.out.println(divide(3, 2));
    add(3, 2);
  }
}
