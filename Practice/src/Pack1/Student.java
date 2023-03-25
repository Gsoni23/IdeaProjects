package Pack1;

public class Student {
    String name;
    String Roll_no;
    String College;

    public Student(String x, String y, String z){
        name = x;
        Roll_no = y;
        College = z;
    }

    public Student(String x, String y){
        name = x;
        Roll_no = y;
        College = "IIT Madras";
    }

    public void get_Student(){
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + Roll_no);
        System.out.println("College: " + College);

    }

    @Override
    public String toString() {
        return name +":"+Roll_no;
    }
}
