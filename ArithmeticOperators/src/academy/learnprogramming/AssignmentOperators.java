package academy.learnprogramming;

public class AssignmentOperators {

    public static void main(String[] args) {
        //int x = 1.0; does not compile
        // short y = 198123123; does not compile
        // int z = 9f;
        //long t = 1923012345678910;

        int x = (int)1.0;
        short y = (short)198123123;
        int z = (int)9f;
        long t = 1923012345678910L;

        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);
        System.out.println("t= " + t);

        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        myByte++;
        mySecondByte--;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        short a =10;
        short b = 20;
        short c = (short)(a*b);
        System.out.println("c= " + c);





    }
}
