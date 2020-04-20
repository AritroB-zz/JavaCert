package academy.learnprogramming;

public class UnaryOperators {

    public static void main(String[] args) {
        int x = +3;
        System.out.println("x= " + x);

        double y = -x;
        System.out.println("x= " + x + " y= "+ y);

        y = -y;
        System.out.println("x= " + x + " y= "+ y);

        boolean a = true;
        boolean b = !a;

        System.out.println("a= " + a + " b= " + b);

        b=!b;
        System.out.println("a= " + a + " b= " + b);

        //increment and decrement be careful, have higher order than (+,-,*,/,...)
        int myInt = 5;
        int otherInt = ++myInt;
        System.out.println("\nmyInt= " + myInt + " otherInt= " + otherInt);

        int newInt =5;
        int newOtherInt = newInt++;
        System.out.println("newInt+ " + newInt + " newOtherInt= " + newOtherInt);

        int count = 0;
        System.out.println("\n" + count);
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count--);
        System.out.println(count);

        int e =3;
        int f = ++e * 5 / e-- + --e;

        System.out.println("e= " + e + " f= " + f);

        int g = 6;
        int h =2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        System.out.println("g= " + g + " h= " + h + " i= " + i);


    }
}
