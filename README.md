A. Project overview

We created classes Student to contain information about every student. It is necessary to understand whether student successful or not.
Class Course was created to contain information about course and students that belong to it. It is necessary to find out the efficiency of the course
Also we created static methods for analysing array of students (calculating total credits, finding number of honors students).
The main goal of the program to store informations about Students and Courses, and calculate theirs academic performance.
Encapsulation was used to protect data from unexpectedly changing and hide unnecessary information from others. For this we created classes, private fields, private methods.

B. Class descriptions

Student: fields: String name, String major, int id, int credits, double gpa.
Student Constructor accepts fields name, id, major and initializes gpa = 0.0 and credits = 0.
Student has getters and setters for all fields, method addCredits to increase credits, method updateGPA to set new GPA, method isHonors to identify student's honority, method toSring to represent class in textual form.

Class Course contain array of class Student. It has method to insert students that uses another private method to increase number of student in array.
Class's methods are using array of students to find average GPA and highest credit student. That is a composition relationship. Also there is method toString.

C. Instructions to Compile and Run

javac *.java 
java Main

D. Screenshots

Screenshots demonstrate input and output of processing Class Student, Class Course and static methods

E. Reflection section

I learned how to create classes, its constructors, access modifiers, static and non-static methods, encapsulation and OOP principles.

I faced challenges with Git because it is new utilite for me, also I faced challenges with processing arrays of created classes.

Encapsulation is about controliing access to data, abstraction is about to show necessary information and hide unnecessary information, what helps users to understand what methods do not how.
Data hiding is about protecting internal data from changing, it prevents direct access to data.
OOP principles make data processing safe and protected but easy to use.
