public class PayrollHourly extends PayrollEmployee{

    private int hoursWorked;
    private double hourlyRate = 20.00;

    public PayrollHourly(int employeeId, String firstName, String lastName, double paycheckTotal, int hoursWorked) {
        super(employeeId, firstName, lastName, paycheckTotal);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
