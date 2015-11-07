package Goyalar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class IsmAlmashtirish {
    public static void main(String[] args) {
        String ismi = "Bahriddin";
        String  familiya = "Inamov";
        System.out.println(ismi);
        System.out.println(familiya);
        String vaqtinchalik = ismi;
        ismi = familiya;
        familiya = vaqtinchalik;
        System.out.println(ismi);
        System.out.println(familiya);
    }
}
