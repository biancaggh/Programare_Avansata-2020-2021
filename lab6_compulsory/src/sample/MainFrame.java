package sample;

import javax.swing.*;

import java.awt.*;

import static java.awt.BorderLayout.CENTER;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing Application");
        setLayout(new BorderLayout());
        setSize(1024,740);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        configPanel=new ConfigPanel();
        add(configPanel,BorderLayout.NORTH);

        canvas=new DrawingPanel();
        add(canvas, BorderLayout.CENTER);
        setVisible(true);
    }

    private void add(DrawingPanel canvas, String center) {
    }


    public void init() {
    }

    public void setPreferredSize() {
    }
}

