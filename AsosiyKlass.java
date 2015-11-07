package VideoDarslar;
import java.util.Scanner;
/**
 * Created by Bahriddin on 09.06.2015.
 */
public class AsosiyKlass {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        System.out.println("Birinchi ustozingiz ismini kiriting");
        String birinchiUstoz = kiritilgan.nextLine();
        Klassozgaruvchisi obekt = new Klassozgaruvchisi(birinchiUstoz);
        obekt.aytish();
    }
}
