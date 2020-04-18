package academy.learnprogramming;

public class UnderstandingNull {

    static Object foo = new Object();
    static Object foo2;
    static String myString;

    public static void main(String[] args) {
        Object localFoo = new Object();
        Object localGoo;

        String name = "Java";
        String anotherName = null;

        System.out.println("foo= " + foo);
        System.out.println("foo2= " + foo2);

        System.out.println("localFoo= " + localFoo);
        //System.out.println("localGoo= " + localGoo);

        System.out.println("name= " + name);
        System.out.println("anotherName= " + anotherName);

        myString = "Lionel";

        System.out.println("myString= " + myString);
        myString.toLowerCase();
        System.out.println("myString= " + myString);





    }
}
