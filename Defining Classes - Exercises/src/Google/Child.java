package Google;

public class Child {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private String birthday;

    Child (String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
