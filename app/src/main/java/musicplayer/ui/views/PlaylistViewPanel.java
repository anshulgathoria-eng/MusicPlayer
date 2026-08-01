package musicplayer.ui.views;

import musicplayer.ui.components.playlist.PlaylistColumnHeaderPanel;
import musicplayer.ui.components.playlist.PlaylistHeaderPanel;
import musicplayer.ui.components.playlist.SongRowPanel;
import musicplayer.ui.layout.SongListPanel;

import javax.swing.JPanel;

import java.awt.Color;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;



import musicplayer.utils.FontManager;






public class PlaylistViewPanel extends JPanel {

    public PlaylistViewPanel(){

        setBackground(Color.WHITE);

        setLayout(new BorderLayout());

        

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel topPanel = new JPanel();

        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(Color.white);

        topPanel.add(new PlaylistHeaderPanel(), BorderLayout.NORTH);
        topPanel.add(new PlaylistColumnHeaderPanel(), BorderLayout.SOUTH);
       

        add(topPanel, BorderLayout.NORTH);
        add(new SongListPanel(), BorderLayout.CENTER);


       

    }
    
}
