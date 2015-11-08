package Goyalar;
import java.util.Scanner;
/**
 * Bismillaxir Rohmanir Rohim
 * Created by Bahriddin on 14.07.2015.
 */
//Archa dasturi
public class Archa {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        int son = kiritilgan.nextInt();
        for (int i=0;i<son;i++) {
            for (int j = i; j > 0; j--)
                System.out.print("*");
                System.out.println();
        }
    }
}
