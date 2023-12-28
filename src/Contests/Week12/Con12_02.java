package Contests.Week12;

public class Con12_02 {
    public static void main(String[] args) {

        MediaPlayable player;

        player = new MusicPlayer();
        player.play("song.mp3");

        player = new VideoPlayer();
        player.play("movie.mp4");

        player = new PodcastPlayer();
        player.play("podcast.mp3");

        Storable store = new PodcastPlayer();

        store.store("podcast.mp3", "/podcasts");

        store = new VideoPlayer();
        store.store("movie.mp4", "/usr/temp");

        store = new MusicPlayer();
        store.store("song.mp3", "/share");

    }
}

interface MediaPlayable {
    void play(String fileName);
}

interface Storable {
    void store(String fileName, String location);
}



class MusicPlayer implements MediaPlayable, Storable {
    @Override
    public void play(String fileName) {
        System.out.println("Playing music: "+fileName);
    }
    @Override
    public void store(String fileName, String location) {
        System.out.println("Storing music: "+fileName+ " at " +location);
    }
}

class VideoPlayer implements MediaPlayable, Storable {

    @Override
    public void play(String fileName) {
        System.out.println("Playing video: "+fileName);
    }
    @Override
    public void store(String fileName, String location) {
        System.out.println("Storing video: "+fileName+ " at " +location);
    }
}

class PodcastPlayer implements MediaPlayable, Storable {
    @Override
    public void play(String fileName) {
        System.out.println("Playing podcast: "+fileName);
    }
    @Override
    public void store(String fileName, String location) {
        System.out.println("Storing podcast: "+fileName+ " at " +location);
    }
}