import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RacingPanel extends JPanel implements ActionListener, KeyListener
{
    // Creation of the requested RaceCars
    private RaceCars purpleRaceCar = new RaceCars("Purple", 0, 12, 425, 500);
    private RaceCars redRaceCar = new RaceCars("Red",0, 12, 425, 450);
    private Timer timer;

    // Abstract Classes
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}

    public RacingPanel()
    {
        this.addKeyListener(this);
        Timer gameTimer = new Timer(100, this); //Set a timer to constantly upd the gameWindow
        gameTimer.start();

        setFocusable(true); // make panel focusable
        setBackground(Color.DARK_GRAY); // paint the RacePanel Background colour in Dark Gray
        setLayout(null);
    }

    //Paint RacingPanel Components method
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // prepare the Graphics context for painting

        // Draw the Track
        Color c1 = Color.white;
        g.setColor( c1 );
        g.drawRect(50, 50, 750, 500);  // Draw the track outer edge
        g.drawRect(150, 150, 550, 300); // Draw the track inner edge
        // road markings
        Color c2 = Color.gray;
        g.setColor( c2 );
        g.drawRect( 100, 100, 650, 400 ); // Draw the middle lane markings
        // Draw the Grass in the middle
        Color c3 = Color.green;
        g.setColor( c3 );
        g.fillRect( 150, 150, 550, 300 );  // Draw the Grass
        // The start
        Color c4 = Color.yellow;
        g.setColor( c4 );
        g.drawLine( 425, 450, 425, 550 ); // Draw the starting point

        // call the resetCarP method from RaceCars Class
        purpleRaceCar.resetCarP(g);
        redRaceCar.resetCarP(g);
    }

    public void actionPerformed(ActionEvent e) {
        // call the moveCar() method
        purpleRaceCar.moveCar();
        redRaceCar.moveCar();
        repaint(); //repaint screen
    }
    public void keyPressed(KeyEvent e)
    {
        int keyArrow = e.getKeyCode();
        int keyWASD = e.getKeyCode();

        // Controlling the redRaceCar using arrow keys up, left, down and right
        if (keyArrow == KeyEvent.VK_UP) // Up Arrow Key press
        {
            if (redRaceCar.getCarSpeed() >= 0 && redRaceCar.getCarSpeed() < 100) {
                redRaceCar.setCarSpeed(redRaceCar.getCarSpeed() + 10);
            }
        }
        if (keyArrow == KeyEvent.VK_LEFT) // Left Arrow Key press
        {
            redRaceCar.setCarDirection(redRaceCar.getCarDirection() - 1); // call the abstract methods from RaceCar Class to updt Direction
            if (redRaceCar.getCarDirection() < 0) // if statement to keep the array of img within the boundary
            {
                redRaceCar.setCarDirection(15);
            }
        }

        if (keyArrow == KeyEvent.VK_DOWN) // Down Arrow Key press
        {
            if (redRaceCar.getCarSpeed() > 0 && redRaceCar.getCarSpeed() <= 100)
            {
                redRaceCar.setCarSpeed(redRaceCar.getCarSpeed() - 10);
            }
        }
        if (keyArrow == KeyEvent.VK_RIGHT) // Right Arrow Key press
        {
            redRaceCar.setCarDirection(redRaceCar.getCarDirection() + 1);
            if (redRaceCar.getCarDirection() > 15)
            {
                redRaceCar.setCarDirection(0);
            }
        }

        //Controlling the purpleRaceCar using keyboard buttons: WASD
        if (keyWASD == KeyEvent.VK_W)
        {
            if (purpleRaceCar.getCarSpeed() >= 0 && purpleRaceCar.getCarSpeed() < 100)
            {
                purpleRaceCar.setCarSpeed(purpleRaceCar.getCarSpeed() + 10);
            }
        }
        if (keyWASD == KeyEvent.VK_A)
        {
            purpleRaceCar.setCarDirection(purpleRaceCar.getCarDirection() - 1);
            if (purpleRaceCar.getCarDirection() < 0)
            {
                purpleRaceCar.setCarDirection(15);
            }
        }
        if (keyWASD == KeyEvent.VK_S)
        {
            if (purpleRaceCar.getCarSpeed() > 0 && purpleRaceCar.getCarSpeed() <= 100)
            {
                purpleRaceCar.setCarSpeed(purpleRaceCar.getCarSpeed() - 10);
            }
        }
        if (keyWASD == KeyEvent.VK_D){
            purpleRaceCar.setCarDirection(purpleRaceCar.getCarDirection() + 1);
            if (purpleRaceCar.getCarDirection() > 15)
            {
                purpleRaceCar.setCarDirection(0);
            }
        }
    }
}