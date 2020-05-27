public class PayrollHourly extends PayrollEmployee {


    private int hoursWorked;
    private double hourlyRate = 20.00;


    public PayrollHourly(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
