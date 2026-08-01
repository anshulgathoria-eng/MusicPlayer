package musicplayer.ui.components.playlist;

import javax.swing.JPanel;

import java.awt.Color;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;




public class PlaylistViewPanel extends JPanel {

    public PlaylistViewPanel(){

        setBackground(Color.white);

        setLayout(new BorderLayout());

        add(new PlaylistHeaderPanel(),BorderLayout.NORTH);

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));



    }
    
}
