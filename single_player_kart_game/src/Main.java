import java.awt.*;
import javax.swing.*;

public class Main
{
    public static void main(String[] args) // program's starting point
    {
        gameWindow enable_jFrame = new gameWindow();
        enable_jFrame.setVisible(true);
    }

    private static class gameWindow extends JFrame
    {
        /* constructor */
        private gameWindow()
        {
            setTitle("A simple Racing Game"); // Set Title
            setBounds(0, 0, 850, 650); // Set window size to 850x650 pixels
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // close the program with the x button
            Container container = getContentPane(); // initialize contents of frame
            container.add(new RacingPanel()); // call method RacingPanel in RacingPanel Class
        }
    }
}
