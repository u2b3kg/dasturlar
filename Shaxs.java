package VideoDarslar;

/**
 * Created by Bahriddin on 13.06.2015. U2B3K
 */
public class Shaxs {
    private String ism;
    private Sana tugilganVaqt;

    public Shaxs(String ismi,Sana tugilganVaqti){
        ism = ismi;
        tugilganVaqt = tugilganVaqti;
    }

    public String toString(){
        return String.format("Ismi %s,tug`ilgan sanasi: %s",ism,tugilganVaqt);
    }
}
