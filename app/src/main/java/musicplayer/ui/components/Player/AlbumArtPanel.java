package musicplayer.ui.components.Player;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import java.awt.Dimension;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Image;





public class AlbumArtPanel  extends JPanel{

    public AlbumArtPanel(){
       
        setBackground(Color.WHITE);

        

        setLayout(new GridBagLayout());

        

        
       
        JLabel albumArt = new JLabel();

        ImageIcon cover = new ImageIcon(
        getClass().getResource("/assets/AlbumArt/AlbumArt2.png")

       );

       Image image = cover.getImage();
       
       Image scaledImage = image.getScaledInstance(
        90,
        80,
        Image.SCALE_SMOOTH
       );

       ImageIcon scaledCover = new ImageIcon(scaledImage);
       albumArt.setIcon(scaledCover);

       

       add(albumArt);

       

    }


    
}
