package VideoDarslar;

/**
 * Bismillaxir Rohmanir Rohim
 * Created by Bahriddin on 14.07.2015.
 */
public class VideoDars {
    public static void main(String[] args) {
       Odam odamObekt = new Odam();
        Bobo boboObekt = new Bobo();
        Ota otaObekt = new Ota();
        Ogil ogilObekt = new Ogil();
        Nabira nabiraObekt = new Nabira();

        odamObekt.Hayot(boboObekt);
        odamObekt.Hayot(otaObekt);
        odamObekt.Hayot(ogilObekt);
        odamObekt.Hayot(nabiraObekt);
    }
}
