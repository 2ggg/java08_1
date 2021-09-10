package ex022;

import javafx.scene.control.Button;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.Parent;
public class MediaServiceImpl implements MediaService{
	MediaPlayer mediaPlayer;
	MediaView mediaView;
	Button btnPlay, btnPause, btnStop;
	boolean endOfMedia;
}
