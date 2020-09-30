public class Student {
    //attributes
    String firstName;
    String lastName;
    double GPA;
    int expectedYearToGraduate;
    String declaredMajor;

    //constructor
    Student(String firstName, String lastName,
            double GPA, int expectedYearToGraduate,
            String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.declaredMajor = declaredMajor;
    }

    //methods
    public void incrementExpectedYearToGraduate() {
        this.expectedYearToGraduate += 1;
    }
}
