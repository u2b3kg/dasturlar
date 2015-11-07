package VideoDarslar;

/**
 * Created by Bahriddin on 09.06.2015.
 */
public class Klassozgaruvchisi {
    private String ustozIsmi;

    public Klassozgaruvchisi(String ismi){
        ismOrnatish(ismi);
    }
    public void ismOrnatish(String ismi){
        ustozIsmi = ismi;
    }
    public String ismOlish(){
        return ustozIsmi;
    }
    public void aytish(){
        System.out.println("Siznin birinchi ustozingiz ismi: "+ismOlish());
    }
}
