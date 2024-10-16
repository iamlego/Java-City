public class B {

    int y = 10;

    void B () {
        System.out.println("This is B from class B");
    }

    int B(int c) {
        return c;
    }
    void A (){
        System.out.println("This is A from B");
    }

    void A (int a ) {
        System.out.println(a);
    }



    public static void main(String[] args) {
        System.out.println("This is class B");

        B b1 = new B();

        b1.A(6);
        System.out.println( b1.B(8));

//        A b1 = new B();

//        System.out.println(b1.x);

    }
}
