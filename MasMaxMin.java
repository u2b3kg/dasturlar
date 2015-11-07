package VideoDarslar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class MasMaxMin {
    public static void main(String[] args) {
        int massiv[] = {2,4,6,1,0,10};
        int engKattaQiymat=massiv[0];
        int kattaQiymatIndeksi = 0;
        for (int i=0;i<massiv.length;i++){
            if (engKattaQiymat<massiv[i]){
                engKattaQiymat = massiv[i];
                kattaQiymatIndeksi = i;
            }
        }
        System.out.printf("Eng katta qiymat: %d u %d indeksda joylasjhgan",
                engKattaQiymat,kattaQiymatIndeksi);
    }
}
