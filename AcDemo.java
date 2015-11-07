package Applet;
import java.awt.*;
import java.applet.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="AcDemo" widht=300 height=50>
</applet>
 */
public class AcDemo extends Applet{
    public void start(){
        AppletContext ac = getAppletContext();
        URL url = getCodeBase();
        try {
            ac.showDocument(new URL(url+"Test.html"));
        }catch (MalformedURLException e) {
            showStatus("Url not found");
        }
    }
}
