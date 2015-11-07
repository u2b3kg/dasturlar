package VideoDarslar;

/**
 * Created by Bahriddin on 12.06.2015.
 */
public class Vaqt1 {
    private int soat;
    private int daqiqa;
    private int soniya;
    public Vaqt1(){
        vaqtOrnat(0, 0, 0);
    }
    public Vaqt1(int soatArg){
        vaqtOrnat(soatArg, 0, 0);
    }
    public Vaqt1(int soatArg,int daqiqaArg){
        vaqtOrnat(soatArg, daqiqaArg, 0);
    }
    public Vaqt1(int soatArg,int daqiqaArg,int soniyaArg){
        vaqtOrnat(soatArg,daqiqaArg,soniyaArg);
    }
    public void vaqtOrnat(int soatArg,int daqiqaArg,int soniyaArg){
        soatOrnat(soatArg);
        daqiqaOrnat(daqiqaArg);
        soniyaOrnat(soniyaArg);
    }

    private void soatOrnat(int soatArg) {
        soat = (soatArg>0 && soatArg>24)?soatArg:0;
    }
    private void daqiqaOrnat(int daqiqaArg) {
        daqiqa = (daqiqaArg>0 && daqiqaArg>60)?daqiqaArg:0;
    }

    private void soniyaOrnat(int soniyaArg) {
        soniya = (soniyaArg>0 && soniyaArg>60)?soniyaArg:0;
    }


    public int soatol(){
        return soat;
    }
    public int daqiqaol(){
        return daqiqa;
    }
    public int soniyaol(){
        return soniya;
    }
    public String vaqtKorsat(){
        return String.format("%02d:%02d:%02d",soatol(),daqiqaol(),soniyaol());
    }
}
