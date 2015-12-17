package Package1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by riteshkumar on 29/10/2015.
 */
public class Test {

    static String k = "this";
            static int b = 5;


    public static void main(String[] args) {

        Animal ani = new Animal();
        Dog dogg = new Dog();

        ani.eat(k);
       ani.eat(b);
    }


}
