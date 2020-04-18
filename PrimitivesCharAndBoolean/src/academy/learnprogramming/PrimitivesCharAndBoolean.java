package academy.learnprogramming;

public class PrimitivesCharAndBoolean {
    public static void main(String[] args) {
        char ch = 'a';

        // char ch1 = 'ab' does not work
        char ch1='1';
        char uniChar = '\u03A9'; //upper case greek omega
        char romanNumber = '\u216C'; //Roman L

        System.out.println("ch1= " + ch1);
        System.out.println("uniChar= " + uniChar);
        System.out.println("romanNumber= " + romanNumber);

        boolean myBoolean = true;
        boolean myFalse = false;

        System.out.println("myBoolean= " + myBoolean);
        System.out.println("myFalse= " + myFalse);

    }
}
