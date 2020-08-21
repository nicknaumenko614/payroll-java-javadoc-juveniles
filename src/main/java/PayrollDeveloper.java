public class PayrollDeveloper extends PayrollEmployee implements BonusPayable, InsurancePayable {

    private double payPeriodEarnings = 9000.00;

    public PayrollDeveloper(int employeeId, String firstName, String lastName, double paycheckTotal) {
        super(employeeId, firstName, lastName, paycheckTotal);
    }

    @Override
    public void payBonus() {

    }

    @Override
    public void payInsurance() {

    }
}
