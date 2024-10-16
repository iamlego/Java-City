import java.sql.Array;
import java.util.Arrays;

public class SortedSquare {


    public static void main(String[] args) {
        int arr[ ] = {-3, -4, 1, 4};
        // [1, 4, 9, 25, 36, 64, 81]



        int ansarr [] = new int[arr.length];

        for(int i = 0; i < arr.length ; i++) {
            int temp = (arr[i] * arr[i]);

            ansarr[i] =temp;
        }

//        int [] ans = Arrays.stream(ansarr).sorted().toArray();
        Arrays.sort(ansarr);

        for(int i = 0; i < ansarr.length; i++) {
            System.out.print(ansarr[i]);
            System.out.print(" ");
        }


    }

}
