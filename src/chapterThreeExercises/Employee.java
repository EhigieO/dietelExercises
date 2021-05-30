package chapterThreeExercises;

public class Employee {
    private String lastName;
    private String firstName;
    private double salary;
    private double annualSalary;

    public Employee(String lastName, String firstName, int monthlySalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSalary(double salary) {
        if (salary < 1) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void annualSalary() {
        annualSalary = salary * 12;
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
}
