import java.util.Scanner;
class HelloWorld {
 public static void main(String[] args) {
 System.out.println("enter your choice");
 System.out.println("+ for addition");
 System.out.println("- for substraction");
 System.out.println("* for multiplication");
 System.out.println("/ for division");
 System.out.println("f for factorial");
 Scanner sc=new Scanner(System.in);
 Scanner s=new Scanner(System.in);
 char a= sc.next().charAt(0);
 int n1, n2;
 
 switch (a) {
 case '+':
 System.out.println("enter 2 numbers");
 n1= s.nextInt();
 n2= s.nextInt();
 System.out.println("addition = "+(n1+n2));
 break;
 case '-':
 System.out.println("enter 2 numbers the first one will be the first number");
 n1= s.nextInt();
 n2= s.nextInt();
 System.out.println("addition = "+(n1-n2));
 break;
 case '/':
 System.out.println("enter 2 numbers first one will be numerator");
 n1= s.nextInt();
 n2= s.nextInt();
 System.out.println("addition = "+(n1/n2));
 break;
 case '*':
 System.out.println("enter 2 numbers");
 n1= s.nextInt();
 n2= s.nextInt();
 System.out.println("addition = "+(n1*n2));
 break;
 case 'f':
 System.out.println("enter a number for factorial");
 n1= s.nextInt();
 int fact=1;
 for(int i=1;i<=n1;i++)
 { 
 fact=fact*i; 
 } 
 System.out.println("Factorial of "+n1+" is: "+fact);
 break;
 default:
 {
 System.out.println("entered a wrong choice");
 }
 }
 
 }
}