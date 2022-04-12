public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String lastName, String firstName, 
                           String employeeNumber, String birthDate, 
                           String SSN, double salary){
        super(lastName, firstName, employeeNumber, birthDate, SSN);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }        

    @Override
    public double earnings(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%sSalary is: $%.2f%n", 
                              super.toString(), getSalary());
    }
}
