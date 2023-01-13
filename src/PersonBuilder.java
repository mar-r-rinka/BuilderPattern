import java.util.Objects;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -99;
    private String address;

    PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
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

    public Person build() {
        if (Objects.isNull(getName()) || Objects.isNull(getSurname())) {
            throw new IllegalStateException("Поле \"name\" и \"surname\" не может быть пустым");
        }
        if (getAge() != -99 && (getAge() < 0 || getAge() > 100)) {
            throw new IllegalArgumentException("Возраст указан некорректно");
        }

        return new Person(getName(), getSurname(), getAge(), getAddress());
    }
}
