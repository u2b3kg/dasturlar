package VideoDarslar;

/**
 * Created by Bahriddin on 14.06.2015. U2B3K
 */
public class Guruh {
    private String ismi;
    private String sharifi;
    private static int miqdori = 0;

    public Guruh(String ism,String sharif){
        ismi = ism;
        sharifi = sharif;
        miqdori++;
    }

    public static int miqdori() {
        return miqdori;
    }
}
