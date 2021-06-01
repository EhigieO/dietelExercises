import chapterThreeExercises.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*(Employee Class) Create a class called Employee that includes three instance variables—a
first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
that initializes the three instance variables. Provide a set and a get method for each instance
variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
that demonstrates class Employee’s capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
again.*/
public class EmployeeTest {
    private Employee employee;
    @BeforeEach
    void each_Should_Start_With(){
        employee = new Employee("Ikpea","Ehigie",50000);
    }
    @Test
    void test_That_Employee_Can_Set_LastName() {
        employee.setLastName("Carter");
        assertEquals("Carter",employee.getLastName());
    }
    @Test
    void test_That_Employee_Can_Set_FirstName(){
        employee.setFirstName("James");
        assertEquals("James",employee.getFirstName());
    }
    @Test
    void test_That_Employee_Can_Set_Monthly_Salary(){
        employee.setSalary(500000.58);
        assertEquals(500000.58,employee.getSalary());
    }
    @Test
    void test_That_Employee_Can_Calculate_Yearly_Salary(){
        employee.setSalary(20000);
        employee.annualSalary();
        assertEquals(240000,employee.getAnnualSalary());
    }
    @Test
    void test_That_Employee_Can_Set_Percentage_Increase(){
        employee.setSalary(20000);
        employee.salaryPercentRaise();
        assertEquals(22000,employee.getSalaryPercentRaise());
    }
    @Test
    void test_That_Employee_Can_Set_Yearly_Increase(){
        employee.yearlyIncrease();

    }
    @Test
    void test_Set_New_salary_Of_Employee(){
        Employee seniorEngineer = new Employee("Okoro", "Kelvin", 500000);
        seniorEngineer.setSalary(900000);
        seniorEngineer.annualSalary();
        assertEquals(900000,seniorEngineer.getSalary());
        assertEquals(10800000,seniorEngineer.getAnnualSalary());
    }
    @Test
    void test_Set_New_Salary_Of_Employee(){
        Employee juniorEngineer = new Employee("Nomso", "Confidence", 500000);
        juniorEngineer.setSalary(200000);
        juniorEngineer.annualSalary();
        juniorEngineer.salaryPercentRaise();
        assertEquals(220000,juniorEngineer.getSalaryPercentRaise());
        assertEquals(200000,juniorEngineer.getSalary());
        assertEquals(2400000,juniorEngineer.getAnnualSalary());
    }
}
