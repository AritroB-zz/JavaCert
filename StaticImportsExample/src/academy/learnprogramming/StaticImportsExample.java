package academy.learnprogramming;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static academy.learnprogramming.Config.*;


public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5,7);
        System.out.println("min = " + min);
        System.out.println(PI);

        Config.printConfig();

        System.out.println("name= " + NAME);
    }
}
