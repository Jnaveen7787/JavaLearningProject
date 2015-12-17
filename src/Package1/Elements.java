package Package1;

/**
 * Created by riteshkumar on 07/12/2015.
 */
public class Elements {
    public static void main(String[] args) {

        int[] shop1 = {30000, 40000, 50000};
        int[] shop2 = { 40000, 50000, 60000};
        int[] outlet_shop1 = { 50000,60000,70000};
        int[] outlet_shop2 = { 60000,70000,80000};

        int[] sum =new int[12];
        int total =0;

        for (int i=0;i<shop1.length; i++)
        {
            sum[i]= shop1[i]+shop2[i];
            sum[i+3]= outlet_shop1[i]+outlet_shop2[i];

        }

        for (int i=0;i<sum.length;i++  )
        {
            System.out.println("Month" + (i+1) + "Sales:\t" + sum[i]);
        total += sum[i];

        }
        System.out.println("Total =  "+ total) ;

    }
}
