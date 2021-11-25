package sample;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Random;

public class DrawingPanel implements ImageObserver {
    final MainFrame frame;
    final static int W = 800, H = 600;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the "tools" needed to draw in the image
    public DrawingPanel(MainFrame frame) {
        this.frame = frame; createOffscreenImage(); frame.init();
    }

    public DrawingPanel() {

        frame = null;
    }

    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE); //fill the image with white
        graphics.fillRect(0, 0, W, H);
    }
    private void init() {
        frame.setPreferredSize(); //don’t use setSize. Why?
        setBorder(BorderFactory.createEtchedBorder()); //for fun
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawShape(e.getX(), e.getY()); frame.repaint();
            } //Can’t use lambdas, JavaFX does a better job in these cases
        });
    }

    private void setBorder(Border etchedBorder) {
    }

    private void addMouseListener(MouseAdapter mouseAdapter) {

    }

    private void drawShape(int x, int y) {
        Random random=new Random();
        int radius =random.nextInt() ; //generate a random number
        int sides = random.nextInt(); //get the value from UI (in ConfigPanel)

        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        Color color = new Color(r,g,b); //create a transparent random Color.
        graphics.setColor(color);
        graphics.fill(new RegularPolygon(x, y, radius, sides));
    }

    public void update(Graphics g) { } //Why did I do that?


    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }


    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }

    private class RegularPolygon implements Shape {
        public RegularPolygon(int x, int y, int radius, int sides) {
            frame.setSize(800, 600);
            frame.setResizable(false);

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            int xPoly[] = {150,250,325,375,450,275,100};
            int yPoly[] = {150,100,125,225,250,375,300};

            Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        }

        @Override
        public Rectangle getBounds() {
            return null;
        }

        @Override
        public Rectangle2D getBounds2D() {
            return null;
        }

        @Override
        public boolean contains(double x, double y) {
            return false;
        }

        @Override
        public boolean contains(Point2D p) {
            return false;
        }

        @Override
        public boolean intersects(double x, double y, double w, double h) {
            return false;
        }

        @Override
        public boolean intersects(Rectangle2D r) {
            return false;
        }

        @Override
        public boolean contains(double x, double y, double w, double h) {
            return false;
        }

        @Override
        public boolean contains(Rectangle2D r) {
            return false;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at) {
            return null;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at, double flatness) {
            return null;
        }
    }
}
