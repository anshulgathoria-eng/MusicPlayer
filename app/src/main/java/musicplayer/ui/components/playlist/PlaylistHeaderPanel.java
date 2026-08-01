package musicplayer.ui.components.playlist;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

import java.awt.Font;

import musicplayer.utils.FontManager;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;




public class PlaylistHeaderPanel extends JPanel {

    public PlaylistHeaderPanel() {

        setBackground(Color.WHITE);

        JLabel PlaylistName = new JLabel("Playlist 1");
        
        setLayout(new BorderLayout());


        PlaylistName.setFont(FontManager.medium(40));
        

        add(PlaylistName, BorderLayout.WEST);

        setBorder(BorderFactory.createEmptyBorder(0,0,30,0));




    }
}