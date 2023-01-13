
import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    protected Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return this.getAge() != -99;
    }

    public boolean hasAddress() {
        return this.getAddress() != null;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(getSurname());
        personBuilder.setAddress(getAddress());
        return personBuilder;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Person person = (Person) o;
            return this.age == person.age && Objects.equals(this.name, person.name) && Objects.equals(this.surname, person.surname) && Objects.equals(this.address, person.address);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.surname, this.age, this.address});
    }

    public String toString() {
        return "Person{name='" + this.name + "', surname='" + this.surname + "', age=" + (hasAge() ? this.age : "Возраст не указан") + ", address='" + (hasAddress() ? this.address : "Адрес не указан") + "'}";
    }
}
