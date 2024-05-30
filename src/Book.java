import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfIssue;

    public Book(Author author, String name, int yearOfIssue) {
        this.author = author;
        this.name = name;
        this.yearOfIssue = yearOfIssue;
    }

    public Author getauthor() {
        return this.author;
    }

    public String getname() {
        return this.name;
    }

    public int getyearOfIssue() {
        return this.yearOfIssue;
    }

    public void setyearOfIssue(int year) {
        this.yearOfIssue = year;
    }

    public String toString() {
        return this.name + ", " + this.author + ", " + this.yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfIssue == book.yearOfIssue && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfIssue, author);
    }
}