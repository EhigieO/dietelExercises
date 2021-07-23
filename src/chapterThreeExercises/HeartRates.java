package chapterThreeExercises;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private final Date dateOfBirth;

    public HeartRates(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth.getMonth()+"/"+dateOfBirth.getDay()+"/"+dateOfBirth.getYear();
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public int maximumRate() {
        return 220 - getAge();
    }

    public void targetHeartRange() {
       int minTargetHeartRange = (maximumRate() * 50) / 100;
       int maxTargetHeartRange = (maximumRate() * 85) / 100;
        System.out.printf("Target heart rate is between %d and %d", minTargetHeartRange, maxTargetHeartRange);
    }
}
