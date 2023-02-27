import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override

    public boolean equals(Object o) {
        if (o == this) {
            return  true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author autor = (Author) o;
        return Objects.equals(name, autor.name)&& Objects.equals(surname, autor.surname);

    }

    }