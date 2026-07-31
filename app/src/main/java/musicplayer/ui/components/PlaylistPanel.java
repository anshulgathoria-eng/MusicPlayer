package musicplayer.ui.components;

import musicplayer.ui.components.RoundedPanel;
import musicplayer.utils.FontManager;
import musicplayer.utils.IconManager;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import javax.swing.JLabel;

import javax.swing.border.Border;

import javax.swing.BorderFactory;

import java.awt.Font;






public class PlaylistPanel extends RoundedPanel {
 
    


    public PlaylistPanel(){

        super(9);

        setBackground(new Color(217,217,217));
        setPreferredSize(new Dimension(249,40));
        setMaximumSize(new Dimension(249, 40));
         
        setLayout(new BorderLayout());

        JLabel playlistLabel = new JLabel("Playlist Name");

        playlistLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        
        playlistLabel.setFont(FontManager.regular(13));
        add(playlistLabel,BorderLayout.WEST);
        
        playlistLabel.setForeground(Color.BLACK);
       
        
       

        JLabel iconLabel = new JLabel(IconManager.get("disc",24));
         
        iconLabel.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        add(iconLabel, BorderLayout.EAST);


        

        






    }
    
}
