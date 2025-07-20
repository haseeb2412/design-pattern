
public class BMain {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setEmailId("haseeb123@gmail.com")
                .setUserId("user123")
                .setUsername("muhammad haseeb")
                .build();

System.out.println(user);

    
    }

}
