package KenArnold;

/**
 * Created by Bahriddin on 18.06.2015. U2B3K
 */

public class Fibo {
    static final int MAX_INDEX = 10;

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        String mark;
        System.out.println("lo:"+lo);
        for (int i=2;i<MAX_INDEX;i++){
            if ((hi % 2)==0)
            mark = " +";
            else
            mark = "";
            System.out.println(i+": "+hi+mark);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
