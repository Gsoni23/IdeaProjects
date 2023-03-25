 interface Add{
    int a=10;
}
 interface Bdd{
    int b=20;
}
 class Cdd implements Add,Bdd{
}
 public class Example_3{
    public static void main(String[] args){
        Cdd oc=new Cdd();
        oc.a=5;
        System.out.println(oc.a);
        oc.b=15;
        System.out.println(oc.b);
    }
}
