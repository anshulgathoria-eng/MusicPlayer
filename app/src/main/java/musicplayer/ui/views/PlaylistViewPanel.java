package musicplayer.ui.views;

import musicplayer.ui.components.playlist.PlaylistColumnHeaderPanel;
import musicplayer.ui.components.playlist.PlaylistHeaderPanel;
import musicplayer.ui.components.playlist.SongRowPanel;
import musicplayer.ui.layout.SongListPanel;
import musicplayer.ui.components.common.ModernScrollBarUI;
import javax.swing.JPanel;

import java.awt.Color;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;



import musicplayer.utils.FontManager;

import javax.swing.JScrollPane;







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
        
        //created an object here

        SongListPanel songListPanel = new SongListPanel();
        
        // passed it to the scrollapne 

        JScrollPane scrollPane = new JScrollPane(songListPanel);
        scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        // enables scrollbar only when needed

        scrollPane.setVerticalScrollBarPolicy(
          JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );
        
        // never enables the horizontal scrolling 

        scrollPane.setHorizontalScrollBarPolicy(
           JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );

        scrollPane.setBorder(null);

        scrollPane.getViewport().setBackground(Color.WHITE);

        add(scrollPane, BorderLayout.CENTER);

       

    }
    
}
