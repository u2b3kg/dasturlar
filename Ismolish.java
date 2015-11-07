package Goyalar;

/**
 * Created by Bahriddin on 09.06.2015.
 */
public class Ismolish {
    private String parol;

    public void parolOrnatish(String kod){
        parol = kod;
    }
    public String parololish(){
        return parol;
    }
    public void chiqarish(){
        System.out.println("Sizning parolingiz: "+parololish());
    }
}
