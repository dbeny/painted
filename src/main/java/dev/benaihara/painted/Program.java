package dev.benaihara.painted;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Program extends Canvas {
    private static final Toolkit tk = Toolkit.getDefaultToolkit();
    private static final Dimension dim = tk.getScreenSize();
    public static final int sw = (int) dim.getWidth();
    public static final int sh = (int) dim.getHeight();
    public static int w = 1000;
    public static int h = 700;

    public static void main(String[] args) throws FileNotFoundException {
        Program program = new Program();

        JFrame frame = new JFrame();
        frame.setBounds((sw/2)-(w/2), (sh/2)-(h/2), w, h);
        frame.setTitle("Painted!");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        w = frame.getWidth();
        h = frame.getHeight();

        frame.add(program);

        File level0 = new File("level0");

        Map map = new MapBuilder(level0).build();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(37, 37, 37));
        g.fillRect(0, 0, w, h);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        g.drawString("Painted!", 50, 50);
    }
}
