Project overview
We created classes Student to contain information about every student. It is necessary to understand whether student successful or not.
Class Course was created to contain information about course and students that belong to it. It is necessary to find out the efficiency of the course
Also we created static methods for analysing array of students (calculating average GPA, finding number of honors students).
The main goal of the program to store informations about Students and Courses, and calculate theirs academic performance.
Encapsulation was used to protect data from unexpectedly changing and hide unnecessary information from others. For this we created classes, private fields, private methods.

Class descriptions
Student: fields: String name, String major, int id, int credits, double gpa.
Student Constructor accepts fields name, id, major and initializes gpa = 0.0 and credits = 0.
Student has getters and setters for all fields, method addCredits to increase credits, method updateGPA to set new GPA, method isHonors to identify student's honority, method toSring to represent class in text form.
