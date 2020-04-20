package academy.learnprogramming;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int result = 3-2+2*2+3;
        System.out.println("result= " + result);
        result= 4/2+1-4*2+10;
        System.out.println("result= " + result);

        int a =4;
        int b = 3-2* --a; //decrement then use
        System.out.println("\na= " + a + "\nb= " + b);

        a=4;
        b=3-2*a--; //use a then decrement
        System.out.println("\na= " + a + "\nb= " + b);

        long c =2;
        long d =4+3*c++; // use then increment
        System.out.println("\nc= " + c + "\nd= " + d);

        result = 10-3*(2+1)-4/(1+3);
        System.out.println("\nresult: " + result);

        int i = 10;
        int j = 3;

        int k = i%j;
        int e = 10%2;
        System.out.println("\nk: " + k + "\ne: " + e);

        int f =12;
        int g=5;
        int h = 2;
        int m = f/2-10%(4+3)-2*f%g-h*3;
        System.out.println("\nm: " + m);





    }
}
