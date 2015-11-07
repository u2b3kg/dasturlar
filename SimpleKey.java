package Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/**
 * Created by Bahriddin on 17.06.2015. U2B3K
 */
/*
<applet code="AppletSkelet" widht=300 height=100>
</applet>
 */
public class SimpleKey extends Applet
        implements KeyListener{
    String msg = "";
    int X = 10, Y = 20;
    public void init(){
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke){
        showStatus("Klavish bosilyabdi");
    }
    public void keyReleased(KeyEvent ke){
        showStatus("Klavish bosilmayabdi");
    }
    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg,X,Y);
    }
}
