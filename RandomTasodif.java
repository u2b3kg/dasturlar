package VideoDarslar;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;
/**
 * Created by Bahriddin on 09.06.2015.
 */
public class RandomTasodif {
    public static void main(String[] args) {
        Random tasodifiySon = new Random();
        System.out.println("Son kiriting !!!");
        Scanner kiritilgan = new Scanner(System.in);
        int a = kiritilgan.nextInt();
        int b = 0;
        for (int i = 0; i < 10; i++) {
            int son = tasodifiySon.nextInt(8)+1;
            System.out.printf("%d,", son);
            if (a == i) {
                b = b + 1;
                System.out.println("Javobi: "+b+ " ta");
            }
        }
    }
}
