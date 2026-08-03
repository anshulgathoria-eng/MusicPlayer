package musicplayer.ui.components.common;

import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.plaf.basic.BasicSliderUI;

import java.awt.Graphics;


import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;

import java.awt.Dimension;


public class ModernSliderUI extends BasicSliderUI {

   


   public ModernSliderUI(JSlider slider) {
    super(slider);
   }

   @Override
   public void paintFocus(Graphics g) {
    // No focus painting
   }






   @Override
   public void paintTrack(Graphics g) {



    Graphics2D g2 = (Graphics2D) g.create();

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );

    g2.setColor(new Color(217, 217, 217));

    g2.fillRoundRect(
            trackRect.x,
            trackRect.y + trackRect.height / 2 - 2,
            trackRect.width,
            4,
            4,
            4
    );

    g2.dispose();


      



   }

      @Override
      protected Dimension getThumbSize() {
      return new Dimension(5, 20);
     }

     // by this function we are basically replacing it with our own graphics over the default slider thumb 

     @Override
     public void paintThumb(Graphics g){


        Graphics2D g2 = (Graphics2D) g.create();

        g2.setColor(Color.BLACK);

        g2.fillRoundRect(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height, 0, 0);



     g2.dispose();

     // dispose is to release the copy .


     }

     
    @Override
    public void paint(Graphics g, JComponent c) {
    Graphics2D g2 = (Graphics2D) g.create();

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

    super.paint(g2, c);

    g2.dispose();
   }

     



  
    
}
