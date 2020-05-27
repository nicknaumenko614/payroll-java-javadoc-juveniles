public class PayrollDeveloper extends PayrollEmployee implements Bonus, Insurance {


    private double payPeriodEarnings = 9000.00;

    public PayrollDeveloper(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    @Override
    public double receiveBonus(double bonus) {
        return bonus;
    }

    @Override
    public double payInsurance() {
        return 80.00;
    }
}
