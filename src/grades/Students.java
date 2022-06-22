
package grades;
import java.util.ArrayList;

public class Students {
    private String name;
    private ArrayList<Integer> grades;

    public Students(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }



//    public Students(String dave, int i) {
//    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
       double total =0;
        for (double v : grades) total += v;
        double average = total/grades.size();
        return average;
    }

}
