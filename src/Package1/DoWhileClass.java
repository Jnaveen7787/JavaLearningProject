package Package1;

import java.io.IOException;

/**
 * Created by riteshkumar on 22/10/2015.
 */
public class DoWhileClass {

    public static void main(String args[]) throws IOException {

        char choice;

        do {
            System.out.println("Help on:");
            System.out.println("1.    If");
            System.out.println("2. Switch");
            System.out.println("3.  While");
            System.out.println("4. do-While");
            System.out.println("5. for\n");
            System.out.println("Choose one:");

            choice = (char) System.in.read();
        }
        while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("Switch \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '3':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '4':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '5':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;

        }

    }
}


