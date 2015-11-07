package VideoDarslar;

/**
 * Created by Bahriddin on 13.06.2015. U2B3K
 */
public class Sana {
    private int kun;
    private int oy;
    private int yil;

    public Sana(int kun,int oy,int yil){
        this.kun = kun;
        this.oy = oy;
        this.yil = yil;
        //System.out.printf("O`rnatilgan sana: %s\n", this);
    }
    public String toString(){
        return String.format("%02d.%02d.%04d yil\n",kun,oy,yil);
    }
}
