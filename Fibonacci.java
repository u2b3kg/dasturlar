package KenArnold;

/**
 * Created by Bahriddin on 18.06.2015. U2B3K
 */
public class Fibonacci {
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        while (hi<50){
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
