package musicplayer.ui.views;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;





public class PlayerViewPanel extends JPanel{

    public PlayerViewPanel(){

      

    setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();


    

    setBackground(Color.blue);

    

    setPreferredSize(new Dimension(0,133));

    setBorder(BorderFactory.createEmptyBorder(
        14, 34, 10, 37
    ));

    JPanel topSection = new JPanel();
    JPanel bottomSection = new JPanel();

    topSection.setBackground(Color.YELLOW);
    bottomSection.setBackground(Color.GREEN);

    gbc.gridx = 0;
    gbc.gridy = 0;

    gbc.weightx = 1.0;
    gbc.weighty = 0.70;

    gbc.fill = GridBagConstraints.BOTH;

    add(topSection, gbc);

    gbc.gridy = 1;

    gbc.weighty = 0.30;

    add(bottomSection, gbc);
    

    






    }


    
}
