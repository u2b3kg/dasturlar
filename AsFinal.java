package VideoDarslar;

/**
 * Created by Bahriddin on 14.06.2015. U2B3K
 */
public class AsFinal {
    public static void main(String[] args) {
        Finaluchun obekt = new Finaluchun(10);
        for (int i = 0; i < 5; i++) {
            obekt.orttir();
            System.out.println(obekt);
        }
    }
}
