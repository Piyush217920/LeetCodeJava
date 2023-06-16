package player;
class players{
    void display(){
        System.out.println("this is super class");
    }  
}
class cricket extends players{
    void display(){
        System.out.println("name of player is Rohit Sharma  and  best score is 3847");
    }
}
class football extends players{
    void display(){
        System.out.println("name of player is Sunil Chhetri and  best score is 84 goals");
    }
}
class hockey extends players{
    void display(){
        System.out.println("name of player is Dhyan Chand and  best score is ");
    }
}
public class Player {
   
    public static void main(String[] args) {
        // TODO code application logic here
        cricket c = new cricket();
        c.display();
        football d = new football();
        d.display();
        hockey e = new hockey();
        e.display();
    }
}
