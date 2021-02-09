public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;

//     constructor
    public Book(String title, String author, String genre, int year ){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getYear() {
        return this.year;
    }
}