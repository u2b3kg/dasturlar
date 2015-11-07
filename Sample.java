package Applet;
import java.awt.*;
import java.applet.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="Sample" widht=300 height=100>
</applet>
 */
public class Sample extends Applet{
    String msg;

    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Bu birinchi applet";
    }
    public void start(){
        msg += "bu esa davomi";
    }
    public void paint(Graphics g){
        msg += " tugadi";
        g.drawString(msg,20,30);
    }
}
