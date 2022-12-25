public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Audiobook(int minutes, int seconds, String title, String author) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }
}