public class Student {

    private String name;
    private int id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, int id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getMajor(){
        return this.major;
    }
    public void setMajor(String major){
        this.major = major;
    }

    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public int getCredits(){
        return this.credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    public void addCredits(int c){
        credits++;
    }
    public void updateGPA(double newGPA){
        gpa = newGPA;
    }
    public boolean isHonors(){
        return (gpa >= 3.5);
    }

    @Override
    public String toString() {
        return "Student {Full name: " + name +
                " ID: " + id +
                " Academic program: " + major +
                " GPA: " + gpa +
                " Credits: " + credits;

    }
}
