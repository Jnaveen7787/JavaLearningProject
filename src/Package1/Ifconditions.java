package Package1;

/**
 * Created by riteshkumar on 22/10/2015.
 */
public class Ifconditions {

    public static void main(String args[]){

        int a,b,c,d,i,j,k;
        i=1;j=10;k=150;b=0;d=3;c=0;a=5;

        System.out.println(a);

        if(i == 10){
            if(j<20)
                a=b;
            if(k>100)
                c=d;
            else
                a=c;

        }
        else a=d;

System.out.println(a);
    }
}
