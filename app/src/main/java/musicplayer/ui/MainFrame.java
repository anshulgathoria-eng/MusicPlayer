package musicplayer.ui;

import javax.swing.JFrame;





public class MainFrame extends JFrame {

    public MainFrame(){
        
        //jframe content
        setTitle("Music PLayer");
        setSize(1200,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
         
        //panels 

        
        add(new MainPanel());
        setVisible(true);
         


    }
    
}
