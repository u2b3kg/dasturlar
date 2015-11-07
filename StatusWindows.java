package Applet;
import java.awt.*;
import java.applet.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="StatusWindows" widht=300 height=100>
</applet>
 */
public class StatusWindows extends Applet{
    public void init(){
        setBackground(Color.green);
    }
    public void paint(Graphics g){
        g.drawString("Bu aplet ichidagi matn",10,20);
        showStatus("Bu tashqaridagi");
    }
}
