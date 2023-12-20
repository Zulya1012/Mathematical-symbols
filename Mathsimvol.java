import java.util.Scanner;
public class Mathsimvol {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a = sc.nextInt();
    System.out.println("Enter the number:");
    int b = sc.nextInt();
    System.out.println(a + "+" + b + "=" + (a + b));
    System.out.println(a + "-" + b + "=" + (a - b));
    System.out.println(a + "*" + b + "=" + (a * b));
    System.out.println(a + "/" + b + "=" + (a / b));
    System.out.println(a + "mod" + b + "=" + (a % b));

  }
}
