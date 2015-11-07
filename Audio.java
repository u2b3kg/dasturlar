package Goyalar;
import java.awt.*;
import java.applet.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
public class Audio extends Applet{
    String msg;

    public void init(){
        setBackground(Color.white);
        setBackground(Color.red);
        msg = "Inside init() ---\n";
    }
    public void start(){
        msg += "Inside start() ---";
    }
    public void paint(Graphics graphics){
        msg += "Inside paint ()  ";
        graphics.drawString(msg,40,60);
    }
}
