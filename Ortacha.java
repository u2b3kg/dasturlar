package VideoDarslar;

/**
 * Created by Bahriddin on 12.06.2015.
 */
public class Ortacha {
    public static void main(String[] args) {
        System.out.println(urtacha(10,20,30));
    }
    public static double urtacha(int...raqamlar){
        double natija = 0;
        for (int x:raqamlar){
            natija += x;
        }
        return (natija/raqamlar.length);
    }
}
