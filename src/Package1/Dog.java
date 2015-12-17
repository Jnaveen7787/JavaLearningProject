package Package1;

/**
 * Created by riteshkumar on 29/10/2015.
 */
public class Dog extends Animal {

    public static void main(String[] args) {
        eat("this");
        eat();
    }

    static void eat(String a) {
        System.out.println("this is overridden method");
    }

    static void eat() {
        System.out.println("this is overridden method in dog class");
    }
}
