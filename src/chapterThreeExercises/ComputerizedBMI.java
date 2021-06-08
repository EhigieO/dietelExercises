package chapterThreeExercises;
import chapterTwoExercises.Bmi;

import java.time.LocalDate;

public class ComputerizedBMI {
    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private int height;
    private int weight;
    private LocalDate localDate;
    private Object Bmi;

    public ComputerizedBMI(String firstName, String lastName, String gender, int day,
                           int month, int year, int height, int weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName =  firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSex(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return localDate.now().getYear() - getYear();
    }

    public Bmi getBMI() {
        Bmi = new Bmi();
        return (chapterTwoExercises.Bmi) Bmi;
    }
}
