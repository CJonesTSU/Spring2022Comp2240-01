public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // Constructors
    public BasePlusCommissionEmployee(String lastName, String firstName, 
                              String employeeNumber, String birthDate, String SSN,
                              double grossSales, double commissionRate, double baseSalary){
        super(lastName, firstName, employeeNumber, birthDate, SSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override
    public double earnings(){
        return baseSalary + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%sBase Salary: $%.2f%nGross Sales: $%.2f%nCommission Rate: $%.2f%n", super.toString(), getBaseSalary(), getGrossSales(), getCommissionRate());
    }
}