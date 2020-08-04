package com.company;

public class EmployeeWageComputation {


        /**
         * The main method now calls the contructor with the parameters declared above and the method computeWages
         * @param args - main method
         */
    public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");
        EmpWageBuilder employeeWageArray = new EmployeeWageArray();
        employeeWageArray.addCompanyToArray("D-Mart", 10, 10,10);
        employeeWageArray.addCompanyToArray("Reliance", 20, 20,20);
        employeeWageArray.computeEmpWage();
    }
}
