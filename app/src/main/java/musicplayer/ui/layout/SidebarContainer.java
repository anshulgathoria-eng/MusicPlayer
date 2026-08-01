package musicplayer.ui.layout;

import javax.swing.JPanel;

import musicplayer.ui.components.common.VerticalDivider;

import java.awt.BorderLayout;

public class SidebarContainer extends JPanel {

    public SidebarContainer() {

        setLayout(new BorderLayout());
       
        add(new SidebarPanel(), BorderLayout.WEST);
        add(new VerticalDivider(), BorderLayout.EAST);
    }

}