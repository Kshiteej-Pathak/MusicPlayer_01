
import javazoom.jl.player.Player;//To run Media Files 

import javax.swing.*;//Window Based Application
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;//awt = Abstract Window Toolkit= GUI Interface
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;//input Output

public class Main {
	 public static void main(String[] args) {
	        @SuppressWarnings("unused")
			MusicPlayer mp;
	        mp = new MusicPlayer();
	    }

}
class MusicPlayer implements ActionListener {

    //Creating Frame
    JFrame frame;

    //Creating Label for printing the selected song name
    JLabel songName;

    //Creating button for selecting a song
    JButton select;

    //Creating Panels
    JPanel playerPanel, controlPanel;

    //Creating icons for buttons
    Icon iconPlay, iconPause, iconResume, iconStop;

    //Creating buttons
    JButton play, pause, resume, stop;

    //Creating FileChooser for choosing the music mp3 file
    JFileChooser fileChooser;

}