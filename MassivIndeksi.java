package VideoDarslar;

import java.util.Scanner;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class MassivIndeksi {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        int massiv[] = {3,2,1,0,5,4,6,8,7,9,0};
        System.out.println("Son : ");
        int index=-1;
        int qidiruvRaqami = kiritilgan.nextInt();
        for (int i=0;i<massiv.length;i++){
            if (massiv[i]==qidiruvRaqami) index = i;
        }
        System.out.printf("'%d' massivning '%d' -elementida joylashgan.",
                qidiruvRaqami,index);
    }
}
