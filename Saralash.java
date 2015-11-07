package VideoDarslar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class Saralash {
    public static void main(String[] args) {
        int massiv[] = {2, 0, 1,5,6,9,8,9,8,10};
        for (int i = 0; i < massiv.length; i++)
            System.out.printf("%d, ", massiv[i]);
        System.out.println();
        int vaqtincha;
        for (int i = 0; i < massiv.length; i++)
            for (int j = 0; j < i; j++)
                if (massiv[i] > massiv[j]) {
                    vaqtincha = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = vaqtincha;
                }
            for (int i = 0; i < massiv.length; i++)
                System.out.printf("%d, ", massiv[i]);
            }
        }
