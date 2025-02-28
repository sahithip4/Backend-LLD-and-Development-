package constructors;

public class Performance {
    int marks = 10;
    double psp = 80.9;

    Performance(){
        this.marks = 10;
        this.psp = 81.9;
    }
    Performance(Performance performance){
        this.marks = performance.marks;
        this.psp = performance.psp;
    }
}
