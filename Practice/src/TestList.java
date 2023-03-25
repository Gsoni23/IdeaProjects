import java.util.*;
public class TestList {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("Nishant");
        list.add("Kapil");
        list.add("Pintu");
        list.add("Harsh");
        list.add("Raj");
        list.add("Ayush");
        System.out.println("Friend's list : "+list);
        Object a[] = list.toArray();
        for (Object i :
                a) {
            System.out.println(i);
        }
    }
}
