import static java.lang.Math.max;
import static java.lang.Math.min;

public class GCD {

    public static void main(String[] args) {
// qwerty
        int x=200;
        int y=31;

        int min = min (x,y);
        int max = max (x,y);
        int gcd = 1;
       
        for (int i = min; i > 1 ; i--) {
            System.out.println("i="+i);
            if (min%i==0 && max%i==0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);

    }
}
