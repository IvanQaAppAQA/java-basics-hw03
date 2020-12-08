import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Student {
    private int rating;
    private String name;

    public static int count = 0;
    public static double rating_ave = 0; // TODO implement Student class according to the instructions provided in the README.md file


    public Student() {
        count++; //TODO initialize name

    }

    public Student(String name) {
        this.name = name;
        count++; //TODO initialize name
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        rating_ave += rating;
        count++;  //TODO initialize name
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Po");
        s1.setRating(6);

        Student s2 = new Student("Yuo");
        s2.setRating(61);

        Student s3 = new Student("Ty", 12);


        System.out.println("Raiting: " + s1.getAvgRating());

        s3.changeRating(5);

        System.out.println("New_Average_Raiting: " + s1.getAvgRating());
    }


    public static double getAvgRating() {

        if (count == 0) return 0.0; // TODO return average rating of all students
        return rating_ave / count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;// TODO set student's name
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        rating_ave += rating;// TODO initialize rating;
    }

    public boolean betterStudent(Student anotherStudent) {
        return this.getRating() > anotherStudent.getRating(); // TODO return the result of comparing this.student's rating with the student's rating

    }

    public void changeRating(int newRating) {
        rating_ave = rating_ave - this.getRating();
        this.setRating(newRating);
        rating_ave += this.getRating(); // TODO change this student's rating and average rating of all students
    }

    public static void removeStudent(Student student) {
        // TODO remove student
    }


    @Override
    public String toString() {
        return this.getName() + " : " + this.getRating(); // TODO return String with name and rating of this student
    }
}
