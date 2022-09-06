
package staff_acadmay;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class imgforsignup extends JPanel{
    private ImageIcon imageicon;
    public imgforsignup(){
        this.setLayout(null);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       imageicon=new ImageIcon(getClass().getResource("..\\img\\3p_1.jpg"));
       imageicon.paintIcon(this, g, 0, 0);
       
    }
}
