package VideoDarslar;
import java.util.Scanner;
/**
 * Created by Bahriddin on 13.06.2015. U2B3K
 */
public class Kirish {
    public static void main(String[] args) {
        for (int i=1;i<3;i++) {
            Scanner kiritilgan = new Scanner(System.in);
            System.out.println("Ismingizni kiriting: ");
            String ismingiz = kiritilgan.nextLine();
            System.out.println("Tugilgan kuningiz: ");
            int kuningiz = kiritilgan.nextInt();
            System.out.println("Tug`ilgan oyingiz: ");
            int oyingiz = kiritilgan.nextInt();
            System.out.println("Tugilga yilingiz: ");
            int yilingiz = kiritilgan.nextInt();
            Sana sanaObekt = new Sana(kuningiz, oyingiz, yilingiz);
            Shaxs shaxsi = new Shaxs(ismingiz, sanaObekt);
            System.out.printf("%s\n", shaxsi);
        }
    }
}
