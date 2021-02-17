import java.util.concurrent.RecursiveTask;

public class Student {
    private String name;
    private double grade;
    private double average;
    private String letterGrade;

    public Student(String name, double grade, double average, String letterGrade) {
        this.name = name;
        this.grade = grade;
        this.average = average;
        this.letterGrade = letterGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }


    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        }
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average >= 0.0 && average <= 100) {
            this.average = average;
        }
    }

    public String getLetterGrade() {
        if(average >= 90.0){letterGrade = "A";}
        else if (average >= 80){letterGrade = "B";}
        else if (average >= 70){letterGrade = "C";}
        else if (average >= 60){letterGrade = "D";}
        else if (average >= 50){letterGrade = "E";}
        else {letterGrade = "F";}
        return letterGrade;
    }
}
