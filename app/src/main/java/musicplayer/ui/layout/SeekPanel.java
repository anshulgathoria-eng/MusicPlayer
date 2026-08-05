package musicplayer.ui.layout;

import java.awt.Color;

import javax.swing.JPanel;

import musicplayer.ui.components.Player.CurrentTimeLabel;
import musicplayer.ui.components.Player.SeekBarPanel;
import musicplayer.ui.components.Player.TotalTimeLabel;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;




public class SeekPanel extends JPanel {

    public SeekPanel(){
       
        setBackground(Color.WHITE);

        setLayout(new GridBagLayout());

        
        GridBagConstraints seekGbc = new GridBagConstraints();
        seekGbc.gridy = 0;
        seekGbc.gridx = 0;
        seekGbc.gridwidth=2;

        seekGbc.weightx = 1.0;

        
        seekGbc.fill = GridBagConstraints.HORIZONTAL;
        
        add(new SeekBarPanel(), seekGbc);


        GridBagConstraints gbc = new GridBagConstraints();
        

        gbc.gridy = 1;
        
        gbc.gridx = 0;
        
        gbc.gridwidth = 1;
        
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;
        
        

        add(new CurrentTimeLabel(), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;

        add(new TotalTimeLabel(), gbc);




    }



    
    
}
