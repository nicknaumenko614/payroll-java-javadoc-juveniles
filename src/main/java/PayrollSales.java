public class PayrollSales extends PayrollEmployee implements Bonus {


    private double payPeriodEarnings = 3000.00;
    private double salesCommission;


    public PayrollSales(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }


    @Override
    public double receiveBonus(double bonus) {
        return bonus;
    }
}
