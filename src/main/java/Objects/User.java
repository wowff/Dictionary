package Objects;

public class User {
    private Long id;
    private String login;
    private String password;
    private String surname;
    private String firstName;
    static private Long userCount = (long)0;

    public User(){}

    public User(String login, String password, String surname, String firstName) {
        this.id = ++userCount;
        this.login = login;
        this.password = password;
        this.surname = surname;
        this.firstName = firstName;
    }

    //геттеры
    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }


    //сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //вывод информации по пользователю
    public void printUserInfo()
    {
        System.out.println("User id = " + getId() + "\n" + "User name = " + getFirstName() + " " + getSurname() + "\n\n");
    }
}
