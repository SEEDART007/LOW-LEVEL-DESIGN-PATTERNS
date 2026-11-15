package BuilderDesignPattern;

public class UserMigrationService {
    public void migrateUser(){
        UserBuilder builder = new UserBuilder();
        builder.setAge(30).setName("rahul").setEmail("rahul@gmail.com");
        User user = new User(builder);
        System.out.println("Successfully migrated user ->"+user);
    }
}
