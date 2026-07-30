package musicplayer.ui;

import javax.swing.JFrame;

import java.awt.BorderLayout;



public class MainFrame extends JFrame {

    public MainFrame(){
        
        //jframe content
        setTitle("Music PLayer");
        setSize(1200,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
         
        //panels 

        setLayout(new BorderLayout());
        add(new SidebarPanel(),BorderLayout.WEST);
        add(new ContentPanel(), BorderLayout.CENTER);
        add(new PlayerPanel(), BorderLayout.SOUTH);
        setVisible(true);
         


    }
    
}
