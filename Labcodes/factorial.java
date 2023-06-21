import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
System.out.println("enter a number to find its factorial");
Scanner sc =new Scanner(System.in);
 int a= sc.nextInt();
 int prod=1,n;
 for (int i=1;i<=a;i++)
 {
 prod=prod*i;
 }
 System.out.println("factorial of "+a+" is "+prod);
}
}