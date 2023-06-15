one.java
import java.rmi.*;
interface one extends Remote
{
 public int palin(String a) throws RemoteException;
}
two.java
import java.rmi.*;
import java.lang.*;
import java.rmi.server.*;
public class two extends UnicastRemoteObject implements one
{
 public two() throws RemoteException { }
 public int palin(String a) throws RemoteException
 {
 System.out.println("Hello");
 StringBuffer str = new StringBuffer(a);
 String str1 = str.toString();
 System.out.println("Print : " + str1.toString());
StringBuffer str2 = str.reverse();
 System.out.println("Print : " + str2.toString());
 int b = str1.compareTo(str2.toString());
 System.out.println("Print : " + b);
 if (b == 0)
 return 1;
 else
 return 0;
 }
}
rmiserver.java
import java.io.*;
import java.rmi.*;
import java.net.*;
public class rmiserver
{
 public static void main(String args[]) throws Exception
 {
 try
 {
 two twox = new two();
 Naming.bind("palin", twox);
 System.out.println("Object registered");
 }
 catch(Exception e)
 {
 System.out.println("Exception" + e);
 }
 }
}
rmiclient.java
import java.io.*;
import java.rmi.*;
import java.net.*;
public class rmiclient
{
 public static void main(String args[]) throws Exception
 {
 try
 {
 String s1 = "rmi://localhost/palin";
 one onex = (one)Naming.lookup(s1);
 int m = onex.palin("madam");
 System.out.println("Print : " + m);
 if (m == 1)
{
 System.out.println("The given string is a Palindrome");
 }
 else
 {
 System.out.println("The given string is not a Palindrome");
 }
 }
 catch (Exception e)
 {
 System.out.println("Exception" + e);
 }
 }
}