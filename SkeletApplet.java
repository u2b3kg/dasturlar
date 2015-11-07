package Applet;
import java.awt.*;
import java.applet.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
/*
<applet code="AppletSkelet" widht=300 height=100>
</applet>
 */
public class SkeletApplet extends Applet{
    //Вызывает первым
    public void init(){
        //инициализация
    }
    /*Вызывает вторым,после init().Также вызывается
        при перезапуск апплет
     */
    public void start(){
        //запускает или возобновляет выполнение
    }
        //Вызывает при остонове аплета
    public void stop(){
        //приостановка выполнение
    }
    /*
    Вызывает перед уничтожение аплета.Это - последный
    выполнением метод.
     */
    public void destroy(){
        //выполняет завершающий действия
    }
    //Вызывает,когда окно аплета должно быт восстоновлено.
    public void paint(Graphics g){
        //перерисовка содержимого окно
    }
}
