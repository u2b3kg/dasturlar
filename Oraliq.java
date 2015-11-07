package Goyalar;
import java.util.Scanner;
/**
 * Created by Bahriddin on 11.06.2015. U2B3K
 */
public class Oraliq {
    public static void main(String[] args) {
        Scanner kiritilgan =  new Scanner(System.in);
        int massiv[] = {0,1,2,3,4,5,6,7,8,9};
        //System.out.println("Birinchi raqamni kiritng: ");
        int index = -1;
        int birinchiRaqam = 3;
        //birinchiRaqam = kiritilgan.nextInt();
        for (int i=0;i<massiv.length;i++){
            System.out.print(massiv[i]+" ");
            if (massiv[i]==birinchiRaqam) index = i;
        }
              System.out.printf("'%d' massivning '%d' -elementida joylashgan.",
                birinchiRaqam,index);
    }
}
