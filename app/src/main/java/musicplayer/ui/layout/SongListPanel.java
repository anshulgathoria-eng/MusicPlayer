package musicplayer.ui.layout;

import javax.swing.JPanel;

import musicplayer.ui.components.playlist.SongRowPanel;

import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.Color;

import javax.swing.BorderFactory;





public class SongListPanel extends JPanel {

    public SongListPanel(){
        
        setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
         
        add(new SongRowPanel());
        add(Box.createVerticalStrut(10));

        add(new SongRowPanel());
        add(Box.createVerticalStrut(10));

        add(new SongRowPanel());

    

    }





    
}
