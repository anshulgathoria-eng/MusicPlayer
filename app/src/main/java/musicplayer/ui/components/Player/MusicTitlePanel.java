package musicplayer.ui.components.Player;

import javax.swing.JPanel;

import musicplayer.utils.FontManager;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.FontMetrics;

import javax.swing.Timer;

import java.awt.Color;




public class MusicTitlePanel extends JPanel {

    private String title = "In the end ........................";

    private int scrollX = 10;
    
    
    private int textWidth;

    private Timer scrollTimer;

    private final int scrollSpeed = 1;

    private int frameCounter = 0;

    public void setTitle(String title) {

    this.title = title;

        scrollX = 10;
    frameCounter = 0;

    repaint();

    }

    private boolean shouldScroll() {

    return textWidth > getWidth();

}

    public MusicTitlePanel(){

        setBackground(Color.WHITE);

        scrollTimer = new Timer(15, e -> {

            if (shouldScroll()) {

            frameCounter++;

               if (frameCounter >= 2) {

                scrollX -= scrollSpeed;

              frameCounter = 0;
          }

}
            
          

            if (scrollX + textWidth < 0) {

             scrollX = getWidth();

            }

            repaint();

        });

        scrollTimer.start();


    }

    @Override
    protected void paintComponent(Graphics g) {

    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g.create();

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );
    
    g2.setFont(FontManager.bold(23));
    g2.drawString(title, scrollX, 20);
    FontMetrics fm = g2.getFontMetrics();
    textWidth = fm.stringWidth(title);

    


    g2.dispose();


    }
    
    
    
}
