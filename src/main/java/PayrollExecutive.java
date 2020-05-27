public class
PayrollExecutive extends PayrollEmployee implements Bonus, Insurance {

    private double payPeriodEarnings = 20000.00;


    public PayrollExecutive(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    @Override
    public double receiveBonus(double bonus) {
        return (bonus*3);
    }

    @Override
    public double payInsurance() {
        return 10;
    }
}
