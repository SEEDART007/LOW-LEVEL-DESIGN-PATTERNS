package BuilderDesignPattern;

public class LoginService {
    void registerUser(String name, int age, String email){
        User user = new User(new UserBuilder().setAge(age).setEmail(email).setName(name));
        System.out.println("User registered successfully ->" + user);
    }
}
