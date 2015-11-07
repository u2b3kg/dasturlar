package VideoDarslar;

/**
 * Created by Bahriddin on 13.06.2015. U2B3K
 */
public class Enum {
    enum Kun{Dushanba,Seshanba,Chorshanba,Payshanba,Juma,Shanba,Yakshanba}
    public static void main(String[] args) {
        Kun kecha = Kun.Chorshanba;
        Kun bugun = Kun.Payshanba;
        Kun ertaga = Kun.Juma;
        System.out.println("Kecha "+kecha+" edi.");
        System.out.println("Bugun "+bugun);
        System.out.println("Ertaga "+ertaga+" boladi");
    }
}
