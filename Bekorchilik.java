package Goyalar;
import java.util.Scanner;
/**
 * Created by Bahriddin on 26.06.2015. U2B3K
 */
public class Bekorchilik {
    private String ism;
    private String familiya;
    private int kod;

    public void ismKiritish(String ismi){
        ism = ismi;
    }
    public void setFamiliya(String familiyasi){
        familiya = familiyasi;
    }
    public void setKod(int kodi){
        kod = kodi;
    }
    public void chiqarish(){
        Scanner kiritilgan = new Scanner(System.in);
        System.out.println("Ism kiriting: ");
        ism = kiritilgan.nextLine();
        System.out.println("Familiya kiriting: ");
        familiya = kiritilgan.nextLine();
        System.err.println("Kodni kiriting: ");
        kod = kiritilgan.nextInt();
    }
    public String korish1(){
        return ism;
    }
    public String korish2(){
        return familiya;
    }
    public int getKod(){
        return kod;
    }
    public void korish3(){
        System.out.println("Ismi : "+korish1());
        System.out.println("Familiyasi: "+korish2());
    }
    public void kodi(){
        int kodlar = 456;
        if (kod==kodlar){
            System.out.println("Kod to`g`ri");
        }else System.err.println("Kod notog`ri");
    }
}
