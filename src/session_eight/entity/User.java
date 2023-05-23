package session_eight.entity;

public class User {
    private static int idCounter = 0;

    private final int id;
    private final String name;
    private final String login;
    private final int password;

    static {
        idCounter++;
    }

    public User(String name, String login, String password) {
        id = idCounter;
        this.name = name;
        this.login = login;
        this.password = password.hashCode();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", login='" + login + '\'' +
            ", password=" + password +
            '}';
    }
}
