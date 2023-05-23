package session_six;

public class User {
    private final String name;
    private final String surname;
    private final int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
    }
}
