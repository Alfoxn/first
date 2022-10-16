import java.util.Optional;

public class Human {
    String name;
    String surname;
    String otchestvo;
    int age;

    Human (){}
    Human(String name, String surname, String otchestvo, int age) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {

        return name;
    }


    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    String getOthestvo() {
        return otchestvo;
    }

    void setAge(int age) {
        this.age = age;
    }

    int Age() {
        return age;
    }

    public String toString() {
        return "Human{" + "name=" + name + " " + "age=" + age + " "+ "surname=" + surname + " "+ "otchestvo = " + otchestvo + "}";
    }}