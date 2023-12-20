import java.util.Scanner;
public class Mathsimvol{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
System.out.println("Vvedite chislo:");
int a=sc.nextInt();
System.out.println("Vvedite chislo:");
int b=sc.nextInt();
System.out.println(a+ "+" +b+ "=" + (a+b));
System.out.println(a+ "-" +b+ "=" + (a-b));
System.out.println(a+ "*" +b+ "=" + (a*b));
System.out.println(a+ "/" +b+ "=" + (a/b));
System.out.println(a+ "mod" +b+ "=" + (a%b));

}
}

