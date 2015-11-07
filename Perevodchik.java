package Goyalar;
import java.util.Scanner;
/**
 * Bismillaxir Rohmanir Rohiym
 * Created by Bahriddin on 16.07.2015.
 */
public class Perevodchik {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        System.out.println("Sozni kiriting: ");
        String str = kiritilgan.nextLine();
        switch (str){
            case "hello":
                System.out.println("Privet");
                break;
            case "world":
                System.out.println("Mir");
                break;
            default:
                System.out.println("Soz topilmadi?");
                break;
        }
    }
}
