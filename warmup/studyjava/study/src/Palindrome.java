import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {



        String text = "aa";
        boolean check = true;
        int last = text.length() - 1;


        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(last)){
                check = false;
                break;
            }


            System.out.print(text.charAt(i));
            System.out.print(text.charAt(last));
            System.out.println(" ");
            last--;
        }

//        System.out.println(check)

    }
}
