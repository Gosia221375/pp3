public class EBook extends Book {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public EBook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }
}