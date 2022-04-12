public abstract class Employee{
    private String firstName;
    private String lastName;
    private String employeeNumber;
    private String birthDate;
    private String SSN;

    // Constructors 
    public Employee(){
        firstName = "";
        lastName = "";
        employeeNumber = "";
        birthDate = "";
        SSN = "";
    }

    public Employee(String lastName, String firstName, 
                    String employeeNumber, String birthDate, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.birthDate = birthDate;
        this.SSN = SSN;
    }

    // getters 
    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public String getSSN(){
        return SSN;
    }

    public abstract double earnings();

    @Override
    public String toString(){
        return String.format("%s, %s%nBirth date: %s%nEmp Num: %s%nSocial Security Number: %s%n", 
                                lastName, firstName, birthDate, employeeNumber, SSN);
    }

}