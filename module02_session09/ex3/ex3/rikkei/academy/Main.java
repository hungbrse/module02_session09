package ex3.rikkei.academy;

public class Main {
    public static void main(String[] args) {


        AudioPlayer  audioPlayer = new AudioPlayer();
        audioPlayer.play();
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();


        Playable audio = new AudioPlayer();
        audio.play();
    }
}
