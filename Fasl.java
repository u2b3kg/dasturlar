package Goyalar;
import java.util.Scanner;
/**
 * Bismillaxir Rohmanir Rohiym
 * Created by Bahriddin on 14.07.2015.
 */
public class Fasl {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        System.out.println("Oyni kirit ");
        int oy = kiritilgan.nextInt();
        String fasllar;
        if (oy==3 || oy==4 || oy==5)
            fasllar = "Bahor";
        if (oy==6 || oy==7 || oy==8)
            fasllar = "Yoz";
        if (oy==9 || oy==10 || oy==11)
            fasllar = "Kuz";
        if (oy==12 || oy==1 || oy==2)
            fasllar = "Qish";
        else
            fasllar = "Bunday oy yoq";
        System.out.println("Siz "+oy+"ni kiritdingiz u oy "+fasllar+" faslida");
    }
}
