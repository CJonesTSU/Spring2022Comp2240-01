public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String lastName, String firstName, 
    String employeeNumber, String birthDate, 
    String SSN, double hourlyRate, double hoursWorked){
        super(lastName, firstName, employeeNumber, birthDate, SSN);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }
    
    @Override
    public double earnings(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString(){
        return String.format("%sNumber of hours: %.2f%nHourly Rate: %.2f%n",
                             super.toString(), getHoursWorked(), getHourlyRate());
    }
}
