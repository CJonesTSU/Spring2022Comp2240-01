public class EmployeeDrive{
    public static void main(String[] args){
        //Employee test = new Employee();
        //Employee test2 = new Employee("Smith","George","T000785654", "02/23/1999", "111-22-3333");
        CommissionEmployee cemp1 = new CommissionEmployee("Jones" , "Betty" , "T00324342" , "01/02/1952", 
                                                          "222-33-4444", 25000, .04);
        BasePlusCommissionEmployee bcemp1 = new BasePlusCommissionEmployee("Snyder" , "Fred" , "T0023434" , "05/02/1985", 
                                                          "333-44-5555", 18000, .05, 600.75);
        SalariedEmployee se1 = new SalariedEmployee("Smith","George","T000785654", "02/23/1999", "111-22-3333", 55);
        HourlyEmployee he1 = new HourlyEmployee("Jones", "Casey", "T00023241234", "1/2/1997", "555-66-7777", 10.10, 39.8);
        //System.out.println("employee 'test' " + test);
        //System.out.println("employee 'test2' " + test2);
        // System.out.println("cemp1 " + cemp1);
        // System.out.println("bcemp1 " + bcemp1);
        // System.out.println("se1 " + se1);
        // System.out.println("he1 " + he1);
        
        Employee[] emps = new Employee[4];
        emps[0] = cemp1;
        emps[1] = bcemp1;
        emps[2] = se1;
        emps[3] = he1;
        for(Employee e : emps){
            printCheck(e);
        }

        System.out.println("The code ran");
    }

    private static void printCheck(Employee e){
        System.out.printf("%s %s%nEmp Num: %s%nSSN %s%nDate of Birth%s%nTotal Pay: $%.2f%n",
                          e.getFirstName(), e.getLastName(), e.getEmployeeNumber(),
                          e.getSSN(), e.getBirthDate(), e.earnings());
        System.out.println();
        System.out.println();

    }
}