import java.util.*;
public class RandomInteger {
    public static void main(String[] args) {
        Random ran = new Random();
        int n = ran.nextInt();
        System.out.println("Value of n : "+n);
        if(n<0) System.out.println("n was a Negative Number");
        System.out.println("Bye Bye");
    }
}
