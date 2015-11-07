package VideoDarslar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class MassivYigindisi {
    public static void main(String[] args) {
        int massiv[] = {1,3,4,2,5};
        int jami = 0;
        for (int i=0;i<massiv.length;i++){
            jami += massiv[i];
        }
        System.out.printf("Yigindi %d ga teng",jami);
    }
}
