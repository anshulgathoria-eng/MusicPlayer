package musicplayer.ui;


import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Dimension;

import musicplayer.ui.components.FolderPanel;
import musicplayer.ui.components.PlaylistPanel;





public class SidebarPanel extends JPanel {

    public SidebarPanel(){

        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(270,0));
        
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        add(new FolderPanel());

        add(new PlaylistPanel());
        
    }
    
}
