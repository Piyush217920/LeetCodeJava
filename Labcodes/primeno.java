public class Main
{
public static void main(String[] args) {
System.out.println("prime number");
int num,n=1;
for(num =2;num<=1000;num++)
{
 int j=0;
 for(int i=1;i<=num;i++)
 {
 if(num%i==0)
 j++;
 }
 if(j==2)
 {
 System.out.print(num+",");
 n++;
 }
 if(n>=50)
 break;
}
}
}