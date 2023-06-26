import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
System.out.println("enter n number addition and average");
Scanner sc =new Scanner(System.in);
 int a= sc.nextInt();
 int sum=0,n;
 for (int i=1;i<=a;i++)
 {
 System.out.print("enter "+i+" number = ");
 n= sc.nextInt();
 sum=sum+n;
 }
 float average=sum/a;
 System.out.println("sum of "+a+" numbers is "+sum+" and average is "+average);
}
}
