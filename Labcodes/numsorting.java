import java.util.*;
public class Main
{
public static void main(String args[])
{
ArrayList<Integer>list=new
ArrayList<Integer>();
list.add(410);
list.add(144);
list.add(967);
list.add(350);
list.add(415);
list.add(290);
System.out.println("Before sorting:"+list);
Collections.sort(list,Collections.reverseOrder());
Collections.sort(list);
System.out.println("After sorting:"+list);
}
}