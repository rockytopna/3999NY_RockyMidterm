package design;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {

    private EmployeeInfo employeeInfo;

    @BeforeTest
    public void initTest() {

        employeeInfo = new EmployeeInfo();
        employeeInfo.setEmployeeName("Eric Topna");
        employeeInfo.setEmployeeId(129087);
        employeeInfo.assignDepartment("Customer Service");
        EmployeeInfo.setCompanyName("Amazon");
        employeeInfo.setEmployeeSalary(20000);
    }

    @Test
    public void testEmployeeName() {

        System.out.println("Testing employeeName()");
        assertEquals("Eric Topna", employeeInfo.employeeName());
    }

    @Test
    public void testEmployeeId() {

        System.out.println("Testing employeeId()");
        assertEquals(129087, employeeInfo.employeeId());
    }

    @Test
    public void testEmployeeDepartment() {

        System.out.println("Testing getEmployeeDepartment()");
        assertEquals("Customer Service", employeeInfo.getEmployeeDepartment());
    }

    @Test
    public void testCompanyName() {

        System.out.println("Testing setCompanyName()");
        assertEquals("Ebay", employeeInfo.getCompanyName());
    }

    @Test
    public void testCalculateSalary() {

        System.out.println("Testing calculateSalary()");
        assertEquals(20000, employeeInfo.calculateSalary());
    }



}