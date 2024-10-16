public class Poweroftwo {

    public static void main(String[] args) {
        int n = 1;
        boolean ans = false;
        int temp = n;
        if(temp%2!=0) {
            ans = false;
        }else{
            for(int i = 0; i < n; i++) {
                temp = temp/2;
                System.out.println(temp);
                if(temp == 1) {
                    ans = true;
                    break;
                }
                if(temp%2!=0) {
                    ans = false;
                    break;
                }
            }
        }



        System.out.println(ans);
    }
}
