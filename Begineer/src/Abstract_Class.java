import java.util.Scanner;

abstract class Shape{
    abstract public void perimeter();
        }
class Circle extends Shape{
    private float r;
    Circle(float r){
        this.r=r;
    }
    public void perimeter() {
        System.out.println("Circle Perimeter:" + 2*(3.1416)*r);
    }
}
class Square extends Shape{
    private float a;
    Square(float a){
        this.a=a;
    }
    public void perimeter() {
        System.out.println("Square Perimeter:"+4*a);
    }
}
class Rectangle extends Shape{
    private float a,b;
    Rectangle(float a,float b){
        this.a=a;
        this.b=b;
    }
    public void perimeter() {
        System.out.println("Rectangle Perimeter:"+ 2*(a+b));
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        System.out.println("Demonstration of Abstract Class");
        Shape shapearr []=new Shape[3];

        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        shapearr[0]=new Circle(x);
        shapearr[1]=new Square(x);
        shapearr[2]=new Rectangle(x,y);

        for (Shape i :
                shapearr) {
            i.perimeter();
        }
    }
}
