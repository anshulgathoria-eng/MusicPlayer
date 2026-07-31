package musicplayer.ui.components.common;

import java.security.PublicKey;

import javax.swing.JPanel;


import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;





public class RoundedPanel extends JPanel{

    private int cornerRadius;
    
    // we take the input for every corner radius for each component used in the app
    public RoundedPanel(int cornerRadius){

        this.cornerRadius= cornerRadius;

        setOpaque(false);

        //since jpanel panels are opaqe by default we did this 

    }
     
    // the paint component is the default component called when using swing for jp 
    @Override
    protected void paintComponent(Graphics g) {
      
        super.paintComponent(g);
       
        // new concept casting 

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
        RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

       // using getbg function to handle color changes 
        g2.setColor(getBackground());
       //"Draw a filled rounded rectangle."
        g2.fillRoundRect(0,0,getWidth(),getHeight(),cornerRadius,cornerRadius);

    }

    
}
