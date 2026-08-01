package musicplayer.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import musicplayer.ui.components.common.HorizontalDivider;

import musicplayer.ui.layout.UpperPanel;
import musicplayer.ui.layout.PlayerContainer;

public class MainPanel extends JPanel {

    public MainPanel() {

        setLayout(new BorderLayout());

        setBackground(Color.WHITE);

        JPanel centerPanel = new JPanel(new BorderLayout());

       centerPanel.add(new HorizontalDivider(), BorderLayout.NORTH);
       centerPanel.add(new UpperPanel(), BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);
        add(new PlayerContainer(), BorderLayout.SOUTH); 
    }
}