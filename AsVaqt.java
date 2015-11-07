package VideoDarslar;

/**
 * Created by Bahriddin on 12.06.2015.
 */
public class AsVaqt {
    public static void main(String[] args) {
        Vaqt vaqtObekt = new Vaqt();
        System.out.println(vaqtObekt.vaqtKorsat());
        vaqtObekt.vaqtOrnat(19,20,15);
        System.out.println(vaqtObekt.vaqtKorsat());
    }
}
