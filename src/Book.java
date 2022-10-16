public class Book {
    String name;
    int page;
    int year;
    String autor;

    Book(String name, int page, int year, String autor) {
        this.name = name;
        this.page = page;
        this.year = year;
        this.autor = autor;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;

    }

    void setPage(int page) {
        this.page = page;
    }

    int getPage() {
        return page;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    String getAutor() {
        return autor;
    }
    public String toString() {
        return "Book{" + "name="+ name + " " + "page="+ page + " " + "year="+ year + " " + "autor="+ autor + "}";

}}


