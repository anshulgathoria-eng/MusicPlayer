package musicplayer.ui;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Dimension;

import musicplayer.ui.components.sidebar.FolderPanel;
import musicplayer.ui.components.sidebar.LibrarylogoPanel;
import musicplayer.ui.components.sidebar.PlaylistPanel;

import musicplayer.utils.FontManager;


import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.BoxLayout;

import javax.swing.Box;







public class SidebarPanel extends JPanel {

    public SidebarPanel(){

        

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(270,0));
        
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        add(new LibrarylogoPanel());

        add(Box.createVerticalStrut(18));   // Gap below "Library"

        add(new FolderPanel());

        add(Box.createVerticalStrut(12));   // Gap between Folder and Playlist

        add(new PlaylistPanel());
        



    }
    
}
