package VideoDarslar;

/**
 * Created by Bahriddin on 10.06.2015.
 */
public class OrinAlmashtirish {
    public static void main(String[] args) {
        int a = 4, b = 5;
        System.out.printf("a=%d,b=%d\n", a, b);
        int vaqtinchalik;
        vaqtinchalik = a;
        a = b;
        b = vaqtinchalik;
        System.out.printf("a=%d,b=%d",a,b);
    }
}
