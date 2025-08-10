package aprendendo_Interface;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Smartphone();
        runMusic(new Smartphone());
        runVideo(new Smartphone());
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
        videoPlayer.pauseVideo();
        videoPlayer.stopVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        musicPlayer.stopMusic();
    }
}
