package aprendendo_Interface;

public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("Smartphone Playing video...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Smartphone Pausing video...");
    }

    @Override
    public void stopVideo() {
        System.out.println("Smartphone Stopping video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone Pausing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone Stopping music...");
    }
}
