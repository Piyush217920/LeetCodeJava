class a {
 public int FunctionName(int x, int y)
 {
 return (x + y);
 }
 public int FunctionName(int x, int y, int z)
 {
 return (x + y + z);
 }
 public double FunctionName(double x, double y)
{
return (x + y);
}
a()
{
 System.out.println("constructor has been called");
}
a(int i)
{
 System.out.println("parametric constructor has been called and here is the value from parameter "+i);
}
 public static void main(String[] args) {
 
 a s = new a();
System.out.println(s.FunctionName(10, 20));
System.out.println(s. FunctionName(10, 20, 30));
System.out.println(s. FunctionName(10.5, 20.5));
a s1 = new a(12);
 }
}
