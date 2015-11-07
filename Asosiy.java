package Goyalar;
import java.util.Scanner;
/**
 * Created by Bahriddin on 09.06.2015.
 */
public class Asosiy {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        System.out.println("Parolingizni yozing");
        String parolingiz = kiritilgan.nextLine();
        Ismolish obekt = new Ismolish();
        obekt.parolOrnatish(parolingiz);
        obekt.chiqarish();
    }
}
