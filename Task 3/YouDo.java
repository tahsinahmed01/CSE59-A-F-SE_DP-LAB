public class User{
    private String username;
    private String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
            return email;
    }
}

 class EmailValidator{
    public static boolean isValidEmail(String email){
        if(email != null && email.contains("@")) {
            return true;
        }
        System.out.println("Invalid email format.");
        return false;
    }
 }

 class UserRepository{

    public void saveUser(User user){
        if (EmailValidator.isValidEmail(user.getEmail())) {
            System.out.println("Connecting to database");
            System.out.println("Saving user" + user.getUsername() + "to the user table");
        }
    }
 }
