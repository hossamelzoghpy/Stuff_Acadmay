
package staff_acadmay;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class image extends JPanel{
    private ImageIcon imageicon;
    public image(){
        this.setLayout(null);
    }
    @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       imageicon=new ImageIcon(getClass().getResource("..\\img\\photo.jpeg"));
       imageicon.paintIcon(this, g, 0, 0);
       
    }
}
