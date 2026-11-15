package BuilderDesignPattern;

public class EmailService {
    public void sendWelcomeEmail(){
        User user = new User(new UserBuilder().setAge(22).setEmail("aman@gmail.com").setName("Aman"));
        System.out.println("Welcome email sent to ->"+user);
    }
}
