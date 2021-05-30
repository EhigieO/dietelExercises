package chapterThreeExercises;

public class HeartRates {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

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

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth.getMonth()+"/"+dateOfBirth.getDay()+"/"+dateOfBirth.getYear();
    }
}
