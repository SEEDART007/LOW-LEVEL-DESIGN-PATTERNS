package BuilderDesignPattern;

public class UserBuilder {
     String name;
     int age;
     String email;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public UserBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

}
