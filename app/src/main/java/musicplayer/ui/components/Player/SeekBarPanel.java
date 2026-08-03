package musicplayer.ui.components.Player;

import java.awt.Color;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JSlider;


import musicplayer.ui.components.common.ModernSliderUI;



public class SeekBarPanel extends JPanel {

    public SeekBarPanel(){

        setBackground(Color.WHITE);

        setLayout(new BorderLayout());

        JSlider seekSlider = new JSlider();

        add(seekSlider, BorderLayout.CENTER);

        seekSlider.setMinimum(0);
        seekSlider.setValue(10);
        seekSlider.setMaximum(100);
        seekSlider.setFocusable(false);

        seekSlider.setBackground(Color.WHITE);

        seekSlider.setOpaque(false);

        seekSlider.setUI(new ModernSliderUI(seekSlider));






    }
    


}
