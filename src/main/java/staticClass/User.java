package staticClass;

public class User {
    // składowa statyczna - pole lub metoda związana z klasą a nie obiektem
    public static int globalId = 1;
    private String login;
    private String password;

    public static void incremetGlobalId(){
        globalId++;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        incremetGlobalId();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
