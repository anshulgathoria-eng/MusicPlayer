package musicplayer.ui.components.Player;

import java.awt.Color;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JSlider;


import musicplayer.ui.components.common.ModernSliderUI;
import musicplayer.ui.components.common.SliderListener;



public class SeekBarPanel extends JPanel {

    public SeekBarPanel(){

        setBackground(Color.WHITE);

        setLayout(new BorderLayout());

        ModernSliderUI seekSlider = new ModernSliderUI();

        seekSlider.addSliderListener(new SliderListener() {

        @Override
         public void valueChanged(int newValue) {
         System.out.println(newValue);
         }
        });

        add(seekSlider, BorderLayout.CENTER);
        
        
        

        






    }
    


}
