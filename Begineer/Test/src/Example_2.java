interface Ad{
    int a=2;
}
interface Bd{
    int b=20;
}
 class C implements Bd{
}
public class Example_2{
    public static void main(String[] args) {
        C oc=new C();
        System.out.println(oc.b);
    }
}
