public class Movie {
    String name;
    int lasting;
    String autor;

    Movie(String name, int lasting, String autor) {
        this.name = name;
        this.lasting = lasting;
        this.autor = autor;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setLasting(int lasting) {
        this.lasting = lasting;
    }

    int getLasting() {
        return lasting;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    String getAutor() {
        return autor;
    }

    public String toString (){
        return "Movie{ "+ "name "+ name + "lasting "+ lasting + "autor " +autor + "}" ;

    }
}

