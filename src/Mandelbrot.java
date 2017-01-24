import javax.swing.*;

/**
 * Created by elizard on 24/01/17.
 */
public class Mandelbrot {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mandelbrot");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Content content = new Content();
        content.setSize(400, 400);
        frame.add(content);
    }
}
