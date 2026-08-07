package musicplayer.ui.components.Player;

import javax.swing.JPanel;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.FontMetrics;



import java.awt.Color;
import java.awt.Dimension;









public class MusicTitlePanel extends JPanel {

    private String title = "Nothing Playing";


    public MusicTitlePanel(){


      setPreferredSize(new Dimension(300, 30));


    }


    @Override
    protected void paintComponent(Graphics g) {

    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g.create();

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );

    g2.setColor(Color.RED);

    FontMetrics fm = g2.getFontMetrics();

    int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent() +1;

    g2.drawString(title, 10, y);

    g2.dispose();

    System.out.println("Painting...");

    System.out.println(getWidth() + " x " + getHeight());

    


   }


    
    
}
