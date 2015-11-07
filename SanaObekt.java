package VideoDarslar;

/**
 * Created by Bahriddin on 13.06.2015. U2B3K
 */
public class SanaObekt {
    public static void main(String[] args) {
        Sana sanaObekt = new Sana(21,4,2014);
        Sana sanaObekt1 = new Sana(21,3,2015);

        Shaxs shaxs1 = new Shaxs("Abdullox",sanaObekt);
        Shaxs shaxs2 = new Shaxs("Bahriddin",sanaObekt1);
        System.out.printf("%s\n%s",shaxs1,shaxs2);
    }
}