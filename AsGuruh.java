package VideoDarslar;

/**
 * Created by Bahriddin on 14.06.2015. U2B3K
 */
public class AsGuruh {
    public static void main(String[] args) {
        Guruh talaba1 = new Guruh("Ahror","Abdumannonov");
        Guruh talaba2 = new Guruh("Anvar","Sanaev");
        Guruh talaba3 = new Guruh("Nomon","Hudoyorov");
        Guruh talaba4 = new Guruh("Adham","Soliev");
        Guruh talaba5 = new Guruh("Jasur","Umirov");
        Guruh talaba6 = new Guruh("Aziz","Aziz");
        System.out.printf("Guruhdagi talabalar %d ta",+Guruh.miqdori());
    }
}
