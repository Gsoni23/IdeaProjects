class Student{
    private int roll_no;
    private String name;

    Student(int roll_no,String name){
        System.out.println("Invoked Parametrized Constructor");
        this.name=name;
        this.roll_no=roll_no;
    }
//    void get_name(){
//        System.out.println("Name : "+ name);
//    }
//    void get_roll(){
//        System.out.println("Roll No. : "+ roll_no);
//    }
    Student(Student s){
        System.out.println("Invoked copy Constructor ");
        this.name=s.name;
        this.roll_no=s.roll_no;
    }
     public String toString() {
         return name + " " + roll_no;
     }
}
public class Copy_cons {
    public static void main(String[] args) {
        Student s1 = new Student(20,"Govind");
        Student s2 = new Student(21,"Prapti");
        Student s3 = new Student(s1);

//        s1.get_name();
//        s1.get_roll();
//
//        s2.get_name();
//        s2.get_roll();
//
//        s3.get_name();
//        s3.get_roll();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
