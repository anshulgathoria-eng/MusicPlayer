package musicplayer.ui.components.playlist;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import musicplayer.utils.FontManager;



public class PlaylistColumnHeaderPanel extends JPanel {

    private int fs=18;

    public PlaylistColumnHeaderPanel() {

         


        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());

        JLabel no = new JLabel("#");
        no.setFont(FontManager.light(fs));
        JLabel song = new JLabel("Song");
        song.setFont(FontManager.light(fs));
        JLabel artist = new JLabel("Artist");
        artist.setFont(FontManager.light(fs));
        JLabel album = new JLabel("Album");
        album.setFont(FontManager.light(fs));
        JLabel duration = new JLabel("Duration");
        duration.setFont(FontManager.light(fs));


        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // #
        gbc.gridx = 0;
        gbc.weightx = 0.05;
        add(no, gbc);

        // Song
        gbc.gridx = 1;
        gbc.weightx = 0.35;
        add(song, gbc);

        // Artist
        gbc.gridx = 2;
        gbc.weightx = 0.25;
        add(artist, gbc);

        // Album
        gbc.gridx = 3;
        gbc.weightx = 0.25;
        add(album, gbc);

        // Duration
        gbc.gridx = 4;
        gbc.weightx = 0.10;
        add(duration, gbc);
    }
}