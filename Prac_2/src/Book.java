public class Book {
    private String title;
    private String author;
    private String genre;
    private String yearOfWriting;

    public Book(String title, String author, String genre, String yearOfWriting) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfWriting = yearOfWriting;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getYearOfWriting() {
        return yearOfWriting;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearOfWriting(String yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public String getAuthorName() {
        String[] arr = author.split(" ");
        return arr[0];
    }

    public String getAuthorSurname() {
        String[] arr = author.split(" ");
        if (arr.length > 1)
            return arr[1];
        return arr[0];
    }
}
