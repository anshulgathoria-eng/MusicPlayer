package musicplayer.ui.layout;
import javax.swing.JPanel;

import musicplayer.ui.components.Player.SongInfoPanel;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


public class PlayerBottomSectionPanel extends JPanel {

    public PlayerBottomSectionPanel(){

        setBackground(Color.YELLOW);

        JPanel controlsPlaceholder = new JPanel();
        JPanel volumePlaceholder = new JPanel();

        controlsPlaceholder.setBackground(Color.GREEN);
        volumePlaceholder.setBackground(Color.BLUE);

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        gbc.fill = GridBagConstraints.BOTH;

        gbc.anchor = GridBagConstraints.WEST;

        add(new SongInfoPanel(),gbc);
        gbc.gridx = 1;
        gbc.weightx = 2.0;

        add(controlsPlaceholder, gbc);


        gbc.gridx = 2;
        gbc.weightx = 1.0;
        add(volumePlaceholder, gbc);


        




    }


    
}
