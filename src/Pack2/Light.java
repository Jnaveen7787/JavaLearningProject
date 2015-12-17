package Pack2;

/**
 * Created by riteshkumar on 07/11/2015.
 */
public class Light {

    public static void main(String[] args) {
        int lightspeed;
        int days;
        int seconds;
        long  distance;

        lightspeed = 186000;// speed of light per second

        days = 10;

        //checking the distance traveled by light in 1000 days

        seconds = days*24*60*60;

            distance = seconds * lightspeed;

        System.out.println(distance);
        System.out.println(seconds);


    }



}
