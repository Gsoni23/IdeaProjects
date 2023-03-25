import java.util.Objects;

class Myclass <T>{
T x;
    Myclass(T x){
        this.x = x;
    }
    void Show(){
        System.out.println(x.getClass().getName() + ":" +x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Myclass<?> myclass = (Myclass<?>) o;
        return Objects.equals(x, myclass.x);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}

public class Gen1 {
//    public <T> void PrintArray(T[] S){}
    public static void main(String[] args) {
        Integer i = 23;
        Character c= 'G';
        String s= "Govind";
        Boolean b = Boolean.TRUE;
        Double d = 11.01;

        Myclass<Integer> m1=new Myclass <Integer>(i);
        Myclass<Character> m2 = new Myclass<Character>(c);
        Myclass<String> m3=new Myclass<String>(s);
        Myclass<Boolean> m4 = new Myclass<Boolean>(b);
        Myclass<Double> m5=new Myclass<Double>(d);

        m1.Show();
        m2.Show();
        m3.Show();
        m4.Show();
        m5.Show();



    }
}
