import java.util.*;

public static Student getTopStudent(Student[] arr){
    int highestGPAStudentIndex = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[highestGPAStudentIndex].getGpa() < arr[i].getGpa()) {
            highestGPAStudentIndex = i;
        }
    }
    return arr[highestGPAStudentIndex];
}

public static int countHonors(Student[] arr){
    int counter = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i].isHonors()) {
            counter++;
        }
    }
    return counter;
}

public static int totalCredits(Student[] arr){
    int credits = 0;
    for (int i = 0; i < arr.length; i++){
        credits = credits + arr[i].getCredits();
    }
    return credits;
}

void main() {
    /*
    Student student = new Student("Nikita", 250298, "SE");

    student.setCredits(5);
    System.out.println("Credits: " + student.getCredits());

    student.addCredits(3);
    System.out.println("New credits: " + student.getCredits());

    student.updateGPA(2.6);
    System.out.println("GPA: " + student.getGpa());

    System.out.println("Student honors? " + student.isHonors());

    System.out.println(student.toString());
    */
    /*
    Course course = new Course("ICT", "Nicholas", 1);

    Student student1 = new Student("Nikita", 250298, "SE");
    student1.updateGPA(1.0);
    Student student2 = new Student("Andrew", 240197, "SE");
    student2.updateGPA(2.0);

    student1.addCredits(2);
    student2.addCredits(5);

    course.addStudent(student1, 0);
    course.addStudent(student2, 1);

    System.out.println(course.toString());
    */
}
