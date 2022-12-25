public class Book {
    private String title;
    private String author;

    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}