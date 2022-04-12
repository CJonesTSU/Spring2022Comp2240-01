public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String lastName, String firstName, 
                              String employeeNumber, String birthDate, String SSN,
                              double grossSales, double commissionRate){
        super(lastName, firstName, employeeNumber, birthDate, SSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;                   
    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    @Override
    public double earnings(){
        return grossSales * commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%sGross Sales: $%.2f, Commission Rate %.2f%n",
                             super.toString(), getGrossSales(), (getCommissionRate()));
    }

}