import java.util.ArrayList;

public class CompanyRoster {

    private static PayrollEmployee employee1 = new PayrollHourly(1001, "Jonh", "Doe",0 ,0);
    private static PayrollEmployee employee2 = new PayrollHourly(1002, "Mary", "Jane",0 ,0);
    private static PayrollEmployee employee3 = new PayrollSales(1003, "Mike", "Rotch",0 ,0, 0);
    private static PayrollEmployee employee4 = new PayrollDeveloper(1004, "Sebrena", "Miller",0);
    private static PayrollEmployee employee5 = new PayrollDeveloper(1005, "Robert", "Smith",0);
    private static PayrollEmployee employee6 = new PayrollDeveloper(1006, "Shawn", "Newcomer",0);
    private static PayrollEmployee employee7 = new PayrollExecutive(1000, "Adam", "Urban",0);



    private static ArrayList<PayrollEmployee> allEmployeesOnPayroll = new ArrayList<>();

    protected void addInitialEmployeesToPayroll (){
        allEmployeesOnPayroll.add (employee1.employeeId, employee1);
        allEmployeesOnPayroll.add (employee2.employeeId, employee2);
        allEmployeesOnPayroll.add (employee3.employeeId, employee3);
        allEmployeesOnPayroll.add (employee4.employeeId, employee4);
        allEmployeesOnPayroll.add (employee5.employeeId, employee5);
        allEmployeesOnPayroll.add (employee6.employeeId, employee6);
        allEmployeesOnPayroll.add (employee7.employeeId, employee7);
    }


}
