package inheritance;

public class Instructor extends User {

    Instructor(){
        System.out.println("constructor of Instructor");
    }
    void teach(){
        System.out.println(name + " is teaching");
    }

}
