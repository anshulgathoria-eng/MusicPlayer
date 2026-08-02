package musicplayer.ui.layout;

import javax.swing.JPanel;

import musicplayer.ui.components.common.HorizontalDivider;

import musicplayer.ui.views.PlayerViewPanel;

import java.awt.BorderLayout;

public class PlayerContainer extends JPanel {

    public PlayerContainer() {

        setLayout(new BorderLayout());
        add(new HorizontalDivider(), BorderLayout.NORTH);
        add(new PlayerViewPanel(), BorderLayout.CENTER);
    }

}