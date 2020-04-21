package academy.learnprogramming;

public class CoundAssignmentOperators {

    public static void main(String[] args) {
        int x =2;
        int z = 3;

        x = x*z;
        x *= z;

        System.out.println("x= " + x);

        //int a += 5; does not work

        //without explicit cast
        long a = 10;
        int b = 4;
        //b = b * a; //does not compile
        //b = (int)(b*a); //too long

        b*= a;
        System.out.println("b= " + b);

        long c =4;
        long d = (c =2);
        System.out.println("c = " + c + " d= " + d);

        long e =3;
        long f = 2;
        long h = 1;
        long i = e+3 * (f=3) - (h-=2);

        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println("h=" + h);
        System.out.println("i=" + i);



    }
}
