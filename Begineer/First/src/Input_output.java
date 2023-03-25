import java.util.*;
class add{
    private int x,y;
    add(int x,int y){
        System.out.println("The add class is used to add two variables");
        this.x =x;
        this.y =y;

    }
    public int sum(){
        return x+y;
    }
}
class output{
    output(String a){
        System.out.println("Your name is "+a);
    }
}
public class Input_output {
    public static void main(String[] args) {
        System.out.println("Its a Input Output Program");

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        output o = new output(a);

        add ad = new add(10,20);
        System.out.println(ad.sum());
    }
}
