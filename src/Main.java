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

}
