package Package1;

import java.sql.SQLOutput;

/**
 * Created by riteshkumar on 22/10/2015.
 */
public class CampClass {
    public static void main(String args[]) {

        boolean b;

        int arrar1[] = {31, 28, 31, 30, 31};
        System.out.println(arrar1[3]);
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println(" b is " + b);
        if (b) System.out.println(" This is executed.");
        b = false;
        if (b) System.out.println(" This is executed.");
        System.out.println("10>9 is" + (10 > 9));
    }
}
