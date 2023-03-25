public class Exception_handle {
    static double sqrt(double x){
        if(x<0) throw new IllegalArgumentException();
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        try {
            System.out.println(sqrt(-25));
        }
        catch (Exception e){
            System.out.println("Exception : "+e);
        }
        System.out.println("Exception handled properly");

    }
}
