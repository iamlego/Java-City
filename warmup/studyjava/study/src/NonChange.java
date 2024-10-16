import java.util.ArrayList;
import java.util.Arrays;

public class NonChange {
    public static void main(String[] args) {

        int [] coins = {5,7,1,1,2,3,22};

        Arrays.sort(coins);
        int c = 0;
        for (int i = 0; i < coins.length;i++) {
            int v = coins[i];

            if(v > c + 1) {
//                System.out.println(c + 1);
                break;
            }
            if(v <= c + 1) {
                c += v;
            }


        }

        System.out.println(c+1);

    }
}
