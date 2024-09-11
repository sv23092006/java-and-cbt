import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MouseMotionDemo extends Applet 
{
    String msg = "";

    public void init()
    {
        addMouseListener(new MouseManager());
        addMouseMotionListener(new MouseMotioner());
    }

    public void paint(Graphics g)
    {
        Font f1 = new Font("Arial", Font.BOLD, 20);
        g.setFont(f1);
        g.drawString(msg, 100, 50);
    }

    class MouseManager implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            msg = "Mouse pressed";
            repaint();
        }

        public void mouseReleased(MouseEvent e)
        {
            msg = "Mouse released";
            repaint();
        }

        public void mouseClicked(MouseEvent e)
        {
            msg = "Mouse clicked";
            repaint();
        }

        public void mouseEntered(MouseEvent e)
        {
            msg = "Mouse Entered";
            repaint();
        }

        public void mouseExited(MouseEvent e)
        {
            msg = "Mouse Exited";
            repaint();
        }
    }

    class MouseMotioner implements MouseMotionListener
    {
        public void mouseMoved(MouseEvent e)
        {
            msg = "Mouse Moved";
            repaint();
        }

        public void mouseDragged(MouseEvent e)
        {
            msg = "Mouse Dragged";
            repaint();
        }
    }
}
	