public class PayrollExecutive extends PayrollEmployee implements BonusPayable, InsurancePayable {

    private double payPeriodEarnings = 20000.00;

    public PayrollExecutive(int employeeId, String firstName, String lastName, double paycheckTotal) {
        super(employeeId, firstName, lastName, paycheckTotal);

    }

    @Override
    public void payBonus() {

    }

    @Override
    public void payInsurance() {

    }
}
