package musicplayer.ui.views;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;

import musicplayer.ui.layout.PlayerTopSectionPanel;
import musicplayer.ui.layout.PlayerBottomSectionPanel;





public class PlayerViewPanel extends JPanel{

    public PlayerViewPanel(){

      

    setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();


    

    setBackground(Color.WHITE);

    

    setPreferredSize(new Dimension(0,133));

    setBorder(BorderFactory.createEmptyBorder(
        14, 34, 10, 37
    ));


    gbc.gridx = 0;
    gbc.gridy = 0;

    gbc.weightx = 1.0;
    gbc.weighty = 0;

    gbc.fill = GridBagConstraints.BOTH;

    add(new PlayerTopSectionPanel(), gbc);

    gbc.gridy = 1;

    gbc.weighty = 0.100;

    add(new PlayerBottomSectionPanel(), gbc);
    

    






    }


    
}
