package VideoDarslar;

/**
 * Created by Bahriddin on 12.06.2015.
 */
public class KonVaqt {
    public static void main(String[] args) {
        Vaqt1 vaqtobekt1 = new Vaqt1();
        Vaqt1 vaqtobekt2 = new Vaqt1(19);
        Vaqt1 vaqtobekt3 = new Vaqt1(19,40);
        Vaqt1 vaqtobekt4 = new Vaqt1(19,40,23);
        System.out.printf("%s\n",vaqtobekt1.vaqtKorsat());
        System.out.printf("%s\n",vaqtobekt2.vaqtKorsat());
        System.out.printf("%s\n",vaqtobekt3.vaqtKorsat());
        System.out.printf("%s\n",vaqtobekt4.vaqtKorsat());
    }
}
