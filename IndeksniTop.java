package Goyalar;
import java.util.Scanner;
/**
 * Created by Bahriddin on 10.06.2015.
 */
public class IndeksniTop {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        System.out.println("Qidirilayotgan raqamni kiritng: ");
        int qidiruvRaqami = kiritilgan.nextInt();
        int massiv[] = {3,2,1,0,5,4,6,8,7,9,0};
        int index=-1;
        for (int i=0;i<massiv.length;i++){
            System.out.print(massiv[i]+" ");
            if (massiv[i]==qidiruvRaqami) index = i;
        }
        System.out.printf("'%d' massivning '%d' -elementida joylashgan.",
                qidiruvRaqami,index);
    }
    }
