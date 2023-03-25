import java.util.*;
//define user defined exception InvalidInputEx
class InvalidInputEx extends Exception {

}


//define the class IntList with
//instance variable of int[]
//and methods set_value, getArray()

class IntList {
    int arr[] = new int[5];
    public void set_value(int x,int y) throws InvalidInputEx {
        if (x>4) {
            throw new InvalidInputEx();
        }
        arr[x]=y;
    }
    public int[] getArray() {
        return arr;
    }
}
class Test_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntList ilist = new IntList();
        try {
            for(int i = 0; i < 5; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                ilist.set_value(n, m);
            }
        }
        catch(InvalidInputEx e) {
            System.out.println(e.getMessage());
            Throwable ori = e.getCause();
            System.out.println(ori.getMessage());
        }
        int[] i_arr = ilist.getArray();
        for(int i = 0; i < i_arr.length; i++)
            System.out.print(i_arr[i] + " ");
    }
}