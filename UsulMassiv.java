package VideoDarslar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class UsulMassiv {
    public static void main(String[] args) {
        int massiv[] = {0,1,2,3,4,5,6};
        uzgartirish(massiv);
        for (int y:massiv)
            System.out.println(y);
    }
    public static void uzgartirish(int x[]){
        for (int sanoq=0;sanoq<x.length;sanoq++)
            x[sanoq] += 5;
    }
}
