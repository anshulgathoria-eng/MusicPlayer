package musicplayer.ui.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;




public class UpperPanel extends JPanel {

    public UpperPanel() {

        
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        add(new SidebarContainer(), BorderLayout.WEST);
        add(new ContentPanel(), BorderLayout.CENTER);
        

        

        

    }

}