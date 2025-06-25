public class App {
    public static void main(String[] args) {
        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando música...");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Música pausada.");
            }

            @Override
            public void stopMusic() {
                System.out.println("Música parada.");
            }
        };
        musicPlayer.playMusic();

    }
}
