package BuilderDesignPattern;

public class User {
    private String name;
    private int age;
    private String email;

    User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email=builder.email;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
