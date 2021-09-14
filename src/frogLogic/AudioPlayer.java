package frogLogic;

 import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.sound.sampled.AudioInputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

    public class AudioPlayer extends Thread {

        File audiofile = new File("C:\\Users\\Joker\\untitled2\\WednesdayFrog\\src\\frogSourec\\audio.mp3");
           public void run() {
            try {
                FileInputStream fis = new FileInputStream(audiofile);
                Player player = new Player(fis);
                player.play();
                            } catch (FileNotFoundException var3) {
                var3.printStackTrace();
            } catch (JavaLayerException var4) {
                var4.printStackTrace();
            }

           }
    }


