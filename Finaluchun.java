package VideoDarslar;

/**
 * Created by Bahriddin on 14.06.2015. U2B3K
 */
public class Finaluchun {
    private int natija;
    private final int ORTTIRMA;
    public Finaluchun(int orttirish){
        ORTTIRMA = orttirish;
    }
    public void orttir(){
        natija += ORTTIRMA;
    }
    public String toString(){
        return String.format("natija = %d",natija);
    }
}
