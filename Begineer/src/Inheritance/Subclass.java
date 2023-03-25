package Inheritance;
class parent{
    parent(){
        System.out.println("Parent class constructor");
    }
}
class child extends parent{
    child(){
        System.out.println("Child class constructor");
    }
}
public class Subclass {
    public static void main(String[] args) {
        child c = new child();
    }
}
