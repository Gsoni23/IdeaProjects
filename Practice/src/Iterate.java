import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
class Bhai{
    String name;
    int index;

    Bhai(int index,String name){
        this.name=name;
        this.index=index;
    }

    @Override
    public String toString() {
        return index + ":"+name;
    }
}
class Count_info{
    Class Obj;
    Constructor[] constructors;
    Field[] fields;
    Method[] methods;
    Count_info(Class Obj){
        this.Obj=Obj;
        constructors=Obj.getConstructors();
        methods= Obj.getMethods();
        fields= Obj.getFields();
    }

    @Override
    public String toString() {
        String s = "Constructors : "+constructors+"\n";
        s += "Methods : "+methods+"\n";
        s += "Fields : "+fields+"\n";
        return s;
    }
}
public class Iterate {
     static <T> void looping(ArrayList l){
        Iterator i;
        for (i = l.iterator(); i.hasNext();) System.out.println(i.next());
    }
    public static void main(String[] args) {
        ArrayList<Bhai> Bro = new ArrayList<Bhai>();
        Bro.add(new Bhai(1,"Nishant"));
        Bro.add(new Bhai(2,"Kapil"));
        Bro.add(new Bhai(3,"Pintu"));
        Bro.add(new Bhai(4,"Raj"));
        Bro.add(new Bhai(5,"Ayush"));
        Bro.add(new Bhai(6,"Harsh"));
        Bro.add(new Bhai(7,"Sumit"));

        ArrayList<Integer> no= new ArrayList<Integer>();
        Integer[] myno = {9,4,6,0,2,8,9,1,0,5};
        Collections.addAll(no,myno);

        looping(Bro);
        System.out.println("Completed one Iteration");
        looping(no);
        System.out.println();
        System.out.println("Now Checking info of a class");

        try {
            Count_info demo = new Count_info(Bro.getClass());
            System.out.println(demo);
        }
        catch (Exception e){
            System.out.println("Some kind of exception is there.");
        }





    }
}
