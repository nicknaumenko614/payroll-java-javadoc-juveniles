public class PayrollSales extends PayrollEmployee implements BonusPayable {

    private double salesComission;
    private double payPeriodEarnings;


    public PayrollSales(int employeeId, String firstName, String lastName, double paycheckTotal, double salesComission, double payPeriodEarnings) {
        super(employeeId, firstName, lastName, paycheckTotal);
        this.salesComission = salesComission;
        this.payPeriodEarnings = payPeriodEarnings;
    }

    public double getSalesComission() {
        return salesComission;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    @Override
    public void payBonus() {

    }
}
