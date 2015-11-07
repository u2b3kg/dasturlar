package Applet;
import java.awt.*;
import java.applet.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="AppletSkelet" widht=200 height=100>
</applet>
 */
public class SimpleBanner extends Applet implements Runnable{
    String msg = " WELCOME TO BAHT GROUP !!!   ";
    Thread t = null;
    int state;
    boolean stopFlag;

    public void init(){
        setBackground(Color.darkGray);
        setForeground(Color.green);
    }
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    public void run(){
        char ch;
        for ( ; ;){
            try {
                repaint();
                Thread.sleep(150);
                ch = msg.charAt(0);
                msg = msg.substring(1,msg.length());
                msg += ch;
                if (stopFlag)
                    break;
            }catch (InterruptedException e){}
        }
    }
    public void stop(){
        stopFlag = true;
        t = null;
    }
    public void paint(Graphics g){
        g.drawString(msg,110,70);
    }
}
