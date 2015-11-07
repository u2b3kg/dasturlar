package Applet;
import java.awt.*;
import java.applet.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="StatusWindows" widht=300 height=100>
<param name = message value = "Java заставляет Web двигатся">
</applet>
 */
public class ParamBanner extends Applet implements Runnable{
    String msg;
    Thread t = null;
    int state;
    boolean stopFlag;

    public void init(){
        setBackground(Color.darkGray);
        setForeground(Color.red);
    }
    public void start(){
        msg = getParameter("message");
        if (msg==null)msg = "Message not found";
        msg = " " + msg;
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
        g.drawString(msg,50,30);
    }
}
