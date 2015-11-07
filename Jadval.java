package VideoDarslar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class Jadval {
    public static void main(String[] args) {
        int massiv1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int massiv2[][] = {{12,21,43,23},{64},{43,67,41}};
        System.out.println("Bu massiv1");
        korsatish(massiv1);
        System.out.println("\nBu massiv2");
        korsatish(massiv2);
    }
    public static void korsatish(int x[][]){
        for (int qator=0;qator<x.length;qator++){
            for (int ustun = 0;ustun<x[qator].length;ustun++)
                System.out.print(x[qator][ustun]+"\t");
            System.out.println();
        }
    }
}
