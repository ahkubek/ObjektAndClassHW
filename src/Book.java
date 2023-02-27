import java.util.Objects;

public class Book {
    private String title;
    private int publisheryear;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisheryear() {
        return publisheryear;
    }

    public void setPublisheryear(int publisheryear) {
        this.publisheryear = publisheryear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, int publisheryear, Author author) {
        this.title = title;
        this.publisheryear = publisheryear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название книги: "+this.title+" год публикации "+this.publisheryear+"Автор "+this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisheryear == book.publisheryear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisheryear, author);
    }
}
