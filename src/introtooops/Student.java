package introtooops;

public class Student {
    private String name;
    private int id;
    private int totalProblemSolved;

    public void solvesProblem(int count){
        this.totalProblemSolved += count;
        System.out.println(name + " solved " + totalProblemSolved + " problems.");
    }

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.totalProblemSolved = 0;
    }


}
