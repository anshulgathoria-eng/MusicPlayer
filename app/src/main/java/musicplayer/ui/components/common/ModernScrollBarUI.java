package musicplayer.ui.components.common;

import javax.swing.plaf.basic.BasicScrollBarUI;

import java.awt.Dimension;
import javax.swing.JButton;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Rectangle;
import java.awt.Color;

public class ModernScrollBarUI extends BasicScrollBarUI {
    

    
        @Override
        protected JButton createDecreaseButton(int orientation) {
        return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
         return createZeroButton();
        }
         
        @Override
        protected Dimension getMinimumThumbSize() {
        return new Dimension(8, 40);
        }

        @Override
        protected void paintThumb(Graphics g, javax.swing.JComponent c, Rectangle thumbBounds) {

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setColor(new Color(180, 180, 180));

        g2.fillRoundRect(
            thumbBounds.x + 2,
            thumbBounds.y + 2,
            thumbBounds.width - 4,
            thumbBounds.height - 4,
            12,
            12
        );

        g2.dispose();
        }

        private JButton createZeroButton() {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(0, 0));
        return button;
        }


    
}
