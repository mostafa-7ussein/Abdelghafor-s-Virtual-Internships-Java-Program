package library.management.system;
public class Book {
    private String title;
    private String author;
    private int ISBN;
    private String publication_date;
    private boolean isAvailable;

    public Book(String title, String author, int ISBN, String publication_date) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication_date = publication_date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", publication_date=" + publication_date + '}';
    }
    
    
    
    
    
}
