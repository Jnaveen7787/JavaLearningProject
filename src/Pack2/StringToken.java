package Pack2;

import java.util.StringTokenizer;

/**
 * Created by riteshkumar on 26/11/2015.
 */
public class StringToken

{

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("I think This will do");
        while (st.hasMoreElements()){

            System.out.println(st.nextElement());
        }
    }



}
