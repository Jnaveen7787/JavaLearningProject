package Package1;

/**
 * Created by riteshkumar on 22/10/2015.
 */
public class DynamicVariables extends CampClass {

    public static void main(String args[]){
        double a=3.0, b=4.0;
    // c is dynamically initialized

    double c =Math.sqrt(a*a+b*b);
    System.out.println("Hypotenuse is " + c);
}
}
