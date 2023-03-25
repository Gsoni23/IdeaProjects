import Pack1.*;
import Pack1.Student;

import java.util.Scanner;

class Employee{
    String name;
    String ID;

    public Employee(String name, String ID){
        this.name=name;
        this.ID=ID;
    }

    @Override
    public String toString() {
        return name +":"+ID ;
    }
}
public class Generics {
    public <T> void printArray(T[] S){
        System.out.println("Working for type : "+ S.getClass());
        for (T x :
                S) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {

        Generics G =new Generics();

        Student[] S1 = new Student [3];
        S1[0]= new Student("Govind","11");
        S1[1]=new Student("Raj","12");
        S1[2]= new Student("Aayush","13");

        Employee[] E1 = new Employee[3];
        E1[0]=new Employee("Kirti","20S1");
        E1[1]=new Employee("Aakansha","21S2");
        E1[2]=new Employee("Prapti","22S3");

        G.printArray(S1);
        G.printArray(E1);


    }
}
