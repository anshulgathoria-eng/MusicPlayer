package musicplayer.ui.components.Player;

import javax.swing.JLabel;

import musicplayer.utils.FontManager;






public class CurrentTimeLabel extends JLabel {

    public CurrentTimeLabel(){

        setText("00:00");

        setFont(FontManager.light(10));





    }
    
}
