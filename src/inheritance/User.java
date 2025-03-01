package inheritance;

public class User {
    String name = "default";
    String email = "default@google.com";
    int age;

    User(){
        System.out.println("Constructor of User");
    }
    void login(){
        System.out.println((name + " is logged in"));
    }

}
