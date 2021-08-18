package chapterThreeExercises;

public class Employee {
    private String lastName;
    private String firstName;
    private double salary;
    private double annualSalary;
    private double salaryRaise;
    private double yearlyIncrease;

    public Employee(String lastName, String firstName, int salary) {
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
        this.annualSalary = salary * 12;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void salaryPercentRaise() {
        this.salaryRaise = salary + (salary * 0.1);
    }

    public double getSalaryPercentRaise() {
        return salaryRaise;
    }

    public void yearlyIncrease() {
        this.yearlyIncrease = (annualSalary * 0.1) + annualSalary;
    }

    public double getYearlyIncrease() {
        return yearlyIncrease;
    }
}
