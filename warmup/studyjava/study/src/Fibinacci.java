import java.util.ArrayList;

public class Fibinacci {
    public static void main(String[] args) {
        int n = 17;
        //0 1 1 2 3 5
        ArrayList<Integer> fib = new ArrayList<Integer>();

        fib.add(0);
        fib.add(1);

        for (int i = 0; i < n-1; i++) {
            int temp = fib.get(i) + fib.get(i+1);
            fib.add(temp);
        }

//
        System.out.println(fib);
        System.out.println(fib.get(n-1));
    }
}
