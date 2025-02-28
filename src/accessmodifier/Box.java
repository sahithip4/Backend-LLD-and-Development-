package accessmodifier;

public class Box {
    //private -> can be accessed only inside the same class
    protected int width = 1;
    //no access modifier -> package private
    int height = 2;
    public int breadth = 3;

    public int getWidth(){
        return width;
    }
}
