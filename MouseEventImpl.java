package Applet;

/**
 * Created by Bahriddin on 17.06.2015. U2B3K
 */
public class MouseEventImpl extends MouseEvent {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked";
        repaint();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Down";
        repaint();
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Up";
        repaint();
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered";
        repaint();
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exitidet.";
        repaint();
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "*";
        showStatus("Dragging mouse at"+mouseX+","+mouseY);
        repaint();
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        showStatus("Mouse moving at"+e.getX()+","+e.getY());
    }
}
