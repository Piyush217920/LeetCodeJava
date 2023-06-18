import java.util.*;
public class Main
{
public static void main(String args[])
{
ArrayList<String>list=new
ArrayList<String>();
list.add("India");
list.add("Pakistan");
list.add("Srilanka");
list.add("USA");
list.add("Australia");
list.add("Japan");
System.out.println("Before sorting:"+list);
Collections.sort(list,Collections.reverseOrder());
Collections.sort(list);
System.out.println("After sorting:"+list);
}
}