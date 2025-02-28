package constructors;

public class Student {
     String name;
     int id;
     int totalProblemSolved;
     Performance performance;

    public void solvesProblem(int count){
        this.totalProblemSolved += count;
        System.out.println(name + " solved " + totalProblemSolved + " problems.");
    }

    //Parameterized constructor
    Student(String name, int id, int totalProblemSolved, Performance performance){
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;
        this.performance = performance;
    }

    //Copy constructor
    Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.totalProblemSolved = s.totalProblemSolved;
        //shallow copy -> this.performance = s.performance;
        //deep copy
        this.performance = new Performance(s.performance);
    }
}
