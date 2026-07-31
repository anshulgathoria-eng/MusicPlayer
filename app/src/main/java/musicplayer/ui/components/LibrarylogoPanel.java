package musicplayer.ui.components;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.border.Border;

import musicplayer.utils.FontManager;

import java.awt.Dimension;



public class LibrarylogoPanel extends JPanel  {
    
    public LibrarylogoPanel(){

        setMaximumSize(new Dimension(249, 40));

        JLabel librarylabel = new JLabel("Library");

       librarylabel.setFont(FontManager.bold(34));

       setLayout(new BorderLayout());

       add(librarylabel,BorderLayout.WEST);

       setBackground(Color.WHITE);



    }




    

    
}
