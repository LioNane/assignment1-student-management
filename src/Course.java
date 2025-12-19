public class Course {

    private String courseName;
    private String instructor;
    private Student[] students;
    private int numberOfStudents;

    public Course(String courseName, String instructor, int numberOfStudents){
        this.courseName = courseName;
        this.instructor = instructor;
        this.numberOfStudents = numberOfStudents;
        students = new Student[numberOfStudents];
    }

    private String GetStudents(){
        String inf = "";
        for (int i = 0; i < students.length; i++){
            inf = inf + students[i].toString();
        }
        return inf;
    }

    private void increaseNumberOfStudents(){
        numberOfStudents = numberOfStudents + 1;
        Student[] newStudents = new Student[numberOfStudents];

        for (int i = 0; i < students.length; i++){
            newStudents[i] = students[i];
        }

        students = newStudents;
    }
    public void addStudent(Student s, int index){
        if (index >= numberOfStudents){
            increaseNumberOfStudents();
        }
        students[index] = s;

    }

    public double courseAverageGPA(){
        double GPASum = 0.0;
        for (int i = 0; i < students.length; i++){
            GPASum = GPASum + students[i].getGpa();
        }
        return GPASum / numberOfStudents;
    }

    public Student highestCreditStudent(){
        int highestCreditStudentIndex = 0;
        for (int i = 0; i < students.length; i++){
            if (students[highestCreditStudentIndex].getCredits() < students[i].getCredits()) {
                highestCreditStudentIndex = i;
            }
        }
        return students[highestCreditStudentIndex];
    }
    @Override
    public String toString(){
        return "Course {Name: " + courseName +  "\n" +
                " Instructor: " + instructor +  "\n" +
                " Number of students: " + numberOfStudents +  "\n" +
                " Students: " + GetStudents() +  "\n" +
                " Average GPA: " + courseAverageGPA() +  "\n" +
                " Highest credit student: " + highestCreditStudent().getName() + "} \n";

    }

}
