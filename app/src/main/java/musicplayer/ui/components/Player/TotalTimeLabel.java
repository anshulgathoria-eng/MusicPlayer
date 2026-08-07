package musicplayer.ui.components.Player;

import javax.swing.JLabel;

import musicplayer.utils.FontManager;


public class TotalTimeLabel extends JLabel {

    public TotalTimeLabel(){


        setText("00:00");

        setFont(FontManager.light(10));
    }
    
}
