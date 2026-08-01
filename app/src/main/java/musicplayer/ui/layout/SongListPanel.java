package musicplayer.ui.layout;

import javax.swing.JPanel;

import musicplayer.ui.components.playlist.SongRowPanel;
import musicplayer.ui.components.common.RoundedPanel;

import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.Color;

import javax.swing.BorderFactory;





public class SongListPanel extends RoundedPanel {

    public SongListPanel(){

        super(40);
        
        setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
         
        for (int i = 1; i <= 25; i++) {

              add(new SongRowPanel());

           if (i < 25) {
          add(Box.createVerticalStrut(10));
           }
        }

    

    }





    
}
