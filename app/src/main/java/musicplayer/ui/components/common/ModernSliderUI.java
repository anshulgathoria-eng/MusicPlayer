package musicplayer.ui.components.common;

import javax.swing.JComponent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class ModernSliderUI extends JComponent {

    // Slider Model
    private int minimum = 0;
    private int maximum = 250;
    private int value = 25;

    // Appearance
    private int trackHeight = 4;

    private int thumbWidth = 4;
    private int thumbHeight = 20;
    private int thumbArc = 3;

    private Color trackColor = new Color(217, 217, 217);
    private Color progressColor = Color.ORANGE;
    private Color thumbColor = Color.BLACK;

    // Listeners
    private final List<SliderListener> listeners = new ArrayList<>();

    public ModernSliderUI() {

        setPreferredSize(new Dimension(300, 20));

        MouseAdapter mouseHandler = new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                updateValue(e.getX());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                updateValue(e.getX());
            }
        };

        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }

    // --------------------------
    // Listener API
    // --------------------------

    public void addSliderListener(SliderListener listener) {
        listeners.add(listener);
    }

    // --------------------------
    // Slider Model
    // --------------------------

    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        this.value = Math.max(minimum, Math.min(value, maximum));

        for (SliderListener listener : listeners) {
            listener.valueChanged(this.value);
        }

        repaint();
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
        repaint();
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
        repaint();
    }

    // --------------------------
    // Appearance API
    // --------------------------

    public void setTrackColor(Color trackColor) {
        this.trackColor = trackColor;
        repaint();
    }

    public void setProgressColor(Color progressColor) {
        this.progressColor = progressColor;
        repaint();
    }

    public void setThumbColor(Color thumbColor) {
        this.thumbColor = thumbColor;
        repaint();
    }

    public void setTrackHeight(int trackHeight) {
        this.trackHeight = trackHeight;
        repaint();
    }

    public void setThumbWidth(int thumbWidth) {
        this.thumbWidth = thumbWidth;
        repaint();
    }

    public void setThumbHeight(int thumbHeight) {
        this.thumbHeight = thumbHeight;
        repaint();
    }

    public void setThumbArc(int thumbArc) {
        this.thumbArc = thumbArc;
        repaint();
    }

    // --------------------------
    // Painting
    // --------------------------

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        double percentage =
                (double) (value - minimum) / (maximum - minimum);

        int progressWidth = (int) (percentage * getWidth());

        // Track

        g2.setColor(trackColor);

        g2.fillRoundRect(
                0,
                getHeight() / 2 - trackHeight / 2,
                getWidth(),
                trackHeight,
                trackHeight,
                trackHeight);

        // Progress

        g2.setColor(progressColor);

        g2.fillRoundRect(
                0,
                getHeight() / 2 - trackHeight / 2,
                progressWidth,
                trackHeight,
                trackHeight,
                trackHeight);

        // Thumb

        int thumbX = progressWidth - thumbWidth / 2;
        thumbX = Math.max(0, Math.min(thumbX, getWidth() - thumbWidth));
        int maxThumbX = getWidth() - thumbWidth - 2;
        
        g2.setColor(thumbColor);

        g2.fillRoundRect(
                thumbX,
                getHeight() / 2 - thumbHeight / 2,
                thumbWidth,
                thumbHeight,
                thumbArc,
                thumbArc);

        g2.dispose();
    }

    // --------------------------
    // Internal
    // --------------------------

    private void updateValue(int mouseX) {

        mouseX = Math.max(0, Math.min(mouseX, getWidth()));

        int newValue =
                (int) ((double) mouseX / getWidth() * maximum);

        setValue(newValue);
    }
}