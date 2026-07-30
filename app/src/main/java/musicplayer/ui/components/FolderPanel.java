package musicplayer.ui.components;

import musicplayer.ui.components.RoundedPanel;


import java.awt.Color;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import javax.swing.BorderFactory;

import java.awt.Font;


import com.formdev.flatlaf.extras.FlatSVGIcon;


import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JLabel;










public class FolderPanel extends RoundedPanel {

    public FolderPanel(){
        
        super(9);

        setBackground(new Color(217,217,217));
        setPreferredSize(new Dimension(249,40));
        
        setLayout(new BorderLayout());
        
        //the folder label is the variable name we are using to create an object  of jlabel 
        JLabel folderLabel = new JLabel("Folder Name");

        folderLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        
        folderLabel.setFont(new Font("Inter", Font.BOLD, 13));
        add(folderLabel,BorderLayout.WEST);
        
        folderLabel.setForeground(Color.BLACK);
       
        
       FlatSVGIcon folderIcon = new FlatSVGIcon("assets/icons/disc.svg", 24, 24);

        JLabel iconLabel = new JLabel(folderIcon);

        add(iconLabel, BorderLayout.EAST);   
        
                         







    }
    
}
