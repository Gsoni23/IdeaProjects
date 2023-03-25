class Jugad{
    Jugad(){
        System.out.println("Inside Constructor");
    }

}
class add{
    add (int x, int y){
        System.out.println(x+y);
    }
}
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Jugad j =new Jugad();
        add a = new add(5,7);
    }
}
