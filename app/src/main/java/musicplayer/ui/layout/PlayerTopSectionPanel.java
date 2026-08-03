package musicplayer.ui.layout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import musicplayer.ui.components.Player.AlbumArtPanel;

import java.awt.Color;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import musicplayer.ui.layout.SeekPanel;

import java.awt.Insets;



import musicplayer.ui.components.Player.AlbumArtPanel;

// add left side padding in top section 


public class PlayerTopSectionPanel extends JPanel {

    public PlayerTopSectionPanel(){


   

    setBackground(Color.WHITE);

    setLayout(new GridBagLayout());

    GridBagConstraints topGbc = new GridBagConstraints();

    topGbc.gridx = 0;
    topGbc.gridy = 0;

    topGbc.weightx = 0;
    topGbc.weighty = 1.0;

    topGbc.fill = GridBagConstraints.NONE;
    topGbc.anchor = GridBagConstraints.WEST;

    topGbc.insets = new Insets(0, 45, 0, 0);

    add(new AlbumArtPanel(), topGbc);
     

          // Seek Panel
          topGbc.gridy = 0;
          topGbc.gridx = 1;

          topGbc.weighty = 1.0;
          topGbc.weightx = 1.0;

          topGbc.anchor = GridBagConstraints.WEST;
          topGbc.fill = GridBagConstraints.BOTH;

          
          add(new SeekPanel(), topGbc);




    }


    
}
