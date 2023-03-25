public class Capitalize{
    public static void main(String[] args) {
        String name = "noRtH CARolIna";
        String small = name.toLowerCase();
        String output = small.substring(0,1).toUpperCase()+small.substring(1,6)+small.substring(6,7).toUpperCase()+small.substring(7);
        System.out.println("Before : "+ name);
        System.out.println("After : "+output);
    }
}