package model;

public class AdapterDemo {
    
    public static void main(String [] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "przykladMP3.mp3");
        audioPlayer.play("mp4", "przykladMP4.mp4");
        audioPlayer.play("mp3", "przykladMP3.mp3");
        audioPlayer.play("mp4", "przykladMP3.mp3");
        audioPlayer.play("mp3", "przykladMP3.mp3");
        audioPlayer.play("avi", "przykładAVI.avi");
        audioPlayer.play("rtr", "przykładAVI.avi");
        audioPlayer.play("asi", "przykładAVI.avi");
        audioPlayer.play("adai", "przykładAVI.avi");
        audioPlayer.play("avsadi", "przykładAVI.avi");
        
   }
}
