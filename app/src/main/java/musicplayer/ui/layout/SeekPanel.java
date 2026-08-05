package musicplayer.ui.layout;

import java.awt.Color;

import javax.swing.JPanel;

import musicplayer.ui.components.Player.SeekBarPanel;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;




public class SeekPanel extends JPanel {

    public SeekPanel(){
       
        setBackground(Color.WHITE);

        setLayout(new GridBagLayout());

        
        GridBagConstraints seekGbc = new GridBagConstraints();
        seekGbc.gridy = 0;
        seekGbc.gridx = 0;

        seekGbc.weighty = 0;
        seekGbc.weightx = 1.0;

        
        seekGbc.fill = GridBagConstraints.HORIZONTAL;
        
        add(new SeekBarPanel(), seekGbc);

        





    }



    
    
}
