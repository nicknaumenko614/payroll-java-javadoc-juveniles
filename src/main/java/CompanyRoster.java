import java.util.ArrayList;

public class CompanyRoster {

    private ArrayList<PayrollEmployee> allEmployees = new ArrayList<>();

    public void addEmployee(PayrollEmployee employees) {
        allEmployees.add(employees);

    }

    public double calculatePay() {
        double paycheckTotal = 0;
        for (PayrollEmployee employee : allEmployees) {
            if (employee instanceof PayrollHourly) {
                paycheckTotal = ((PayrollHourly) employee).getHoursWorked() * ((PayrollHourly) employee).getHourlyRate();

            } else if(employee instanceof PayrollSales || employee instanceof PayrollDeveloper || employee instanceof  PayrollExecutive) {
              paycheckTotal = employee


            }
        }
        return paycheckTotal;
    }


    public ArrayList<PayrollEmployee> getAllEmployees() {
        return allEmployees;
    }
}
