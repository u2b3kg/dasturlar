package Applet;
import java.awt.*;
import java.applet.*;
import java.net.URL;

/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="Bases" widht=300 height=50>
</applet>
 */
public class Bases extends Applet{
    public void paint(Graphics g){
        String msg;
        URL url = getCodeBase();
        msg = "Code base: "+url.toString();
        g.drawString(msg,10,30);
        url = getDocumentBase();
        msg = "Document base: "+url.toString();
        g.drawString(msg,10,50);
    }
}
