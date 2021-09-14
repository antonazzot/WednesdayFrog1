package frogLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrogEngine extends JFrame implements ActionListener, Runnable {
    Timer timer;
    public static int frameCounter = 0;
    public AudioPlayer audioPlayer = new AudioPlayer();
    int frameSizeX;
    int frameSizeY;
    int frameStartX;
    int frameStartY;
    public static Image image;
    {
        ImageIcon i = new ImageIcon("C:\\Users\\Joker\\untitled2\\WednesdayFrog\\src\\frogSourec\\frog.jpg");
       image = i.getImage();
    }

   public FrogEngine() {
        setBounds(getstartX(), frameStartY, frameSizeX, frameSizeY);
        setTitle("Frog");
        add(new panelwithBackground());
        setVisible(true);
        if (frameCounter == 1) {
            try {
                Thread.sleep(13800L);
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }

        ++frameCounter;
    }

    public void actionPerformed(ActionEvent e) {
        new FrogEngine();

        if (frameCounter > 26000) {
            timer.stop();
            //throw new Error();
        }
    }

    public int getstartX() {
        if (frameCounter == 0) {
            frameSizeX = 600;
            frameSizeY = 600;
            frameStartY = 0;

            return 0;
        } else {
            Random random = new Random();
            frameSizeX = randomSize();
            frameSizeY = randomSize();
            frameStartY = random.nextInt(1200);
            return random.nextInt(1600);
        }
    }

    public void run() {
        audioPlayer.start();
        timer = new Timer(10, this);
        timer.start();
    }

    public int randomSize() {
        Random random = new Random();
        return random.nextInt(700);
    }

    class panelwithBackground extends JPanel {


        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

}


