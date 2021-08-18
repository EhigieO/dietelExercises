package Estore;

import bankapp.User;
import chapterThreeExercises.Date;

import java.time.LocalDate;

public class Users extends User {
    private String emailAddress;
    private Date dateOfBirth;
    private String homeAddress;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setDateOfBirth(int month, int day, int year) {
        this.dateOfBirth = new Date(month,day,year);
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
}
