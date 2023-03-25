import java.util.*;
public class Duplicate_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder net = new StringBuilder();
        // Fill the code here
        for (int i=0;i<=s.length();i++){
            if(net.toString().contains("s.charAt(i)")){
//                continue;
            }
            else {
                net.append(s.charAt(i));
            }
        }
        System.out.println(net);

    }
}
