package last.hope.api.Sergio;


import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Hello world!
 *
 */
public class App extends JFrame{
App(){
  JLabel label=new JLabel("Все оно видит");
  setSize(300,300);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setVisible(true);
  sergio();
}

  public void sergio() {
    try {
      URL url = this.getClass().getClassLoader().getResource("music/APPLAUSE.WAV");
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.setFramePosition(0);
      clip.start();
      Thread.sleep(5000);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new App();

  }
}
