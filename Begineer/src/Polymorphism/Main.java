package Polymorphism;
class Employee{
    private String name;
    private float salary;

    Employee (String name,float salary){
        this.name=name;
        this.salary=salary;
    }

    public void get_var(){
        System.out.println("Your name "+ name);
        System.out.println("Your salary "+ salary);
    }

    public float bonus(float percent){
        return (percent/100)*salary;
    }

}
class Manager extends Employee{
    private String Secretary;
    Manager (String n,float s,String sn) {
        super(n, s);
        System.out.println("You are a Manager");
        Secretary =sn;
    }
    public void show_sec(){
        System.out.println("Your Secretary is "+ Secretary);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m1=new Manager("Govind",1000000,"Anindita");
        Employee e1=new Employee("Nishant",500000);
        Employee e2=new Employee("Raj",400000);
        Employee e3=new Employee("Ayush",300000);

        m1.get_var();
        m1.show_sec();
        e1.get_var();
        e2.get_var();
        e3.get_var();
    }

}
