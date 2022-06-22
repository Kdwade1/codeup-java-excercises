package grades;

public class StudentTest {
    public static void main(String[] args) {
        Students student = new Students("Dave");
        Students frank = new Students("Frank");
        student.addGrade(20);
        student.addGrade(30);
        frank.addGrade(50);
        frank.addGrade(60);
        frank.addGrade(70);
        System.out.println(frank.getGradeAverage());
        System.out.println(student.getGradeAverage());

    }
}
