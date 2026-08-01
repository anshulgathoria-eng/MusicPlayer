package musicplayer.ui.components.playlist;

import java.awt.Color;

import musicplayer.utils.FontManager;



import musicplayer.ui.components.common.RoundedPanel;

import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.Dimension;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;

import java.awt.Insets;

import java.awt.Font;

import javax.swing.BorderFactory;





public class SongRowPanel extends RoundedPanel{

    private int fs = 16;


    public SongRowPanel(){
     
        super(11);

        //not working for some reason 

        setBackground(new Color(217,217,217));

        setLayout(new GridBagLayout());

        setPreferredSize(new Dimension(0,55));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 55));

        JLabel no = new JLabel("1");
        no.setFont(FontManager.light(fs));

        JLabel song = new JLabel("In the End");
        song.setFont(FontManager.light(fs));
        JLabel artist = new JLabel("Ans");
        artist.setFont(FontManager.light(fs));

        JLabel album = new JLabel("Hybrid Theory");
        album.setFont(FontManager.light(fs));
        

        JLabel duration = new JLabel("03:36");
        duration.setFont(FontManager.light(fs));
       // duration.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 30));


        

        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 10, 0, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx = 0;
        gbc.weightx = 0.05;
        add(no, gbc);
        


        gbc.gridx = 1;
        gbc.weightx = 0.35;
        add(song, gbc);
        
             
        gbc.gridx = 2;
        gbc.weightx = 0.25;
        add(artist, gbc);

        gbc.gridx = 3;
        gbc.weightx = 0.25;
        add(album, gbc);

        gbc.gridx = 4;
        gbc.weightx = 0.10;
        add(duration, gbc);




    }


    
}
