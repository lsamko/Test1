package commonTasks;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class playSoundDemo extends JFrame {

        // конструктор
   public playSoundDemo() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Play Sound Demo");
            this.setSize(300, 200);
            this.setVisible(true);

            try {
                URL url = this.getClass().getResource("MyAudio.wav");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            new playSoundDemo();
        }
}
