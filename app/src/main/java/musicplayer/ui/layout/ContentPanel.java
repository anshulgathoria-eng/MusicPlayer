package musicplayer.ui.layout;

import javax.swing.JPanel;


import musicplayer.ui.views.PlaylistViewPanel;

import java.awt.Color;

import javax.swing.border.Border;
import java.awt.BorderLayout;





public class ContentPanel extends JPanel {

    public ContentPanel(){

    setBackground(Color.white);

    setLayout(new BorderLayout());

    add(new PlaylistViewPanel(), BorderLayout.CENTER);



    }
    
}
