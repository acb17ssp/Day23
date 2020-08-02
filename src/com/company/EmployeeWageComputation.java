package com.company;

public class EmployeeWageComputation {

    // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    /**
     * This is a void method used to calculate the salary of the employee
     */
    public static void computeWages(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours){

        // Variables
        int empHours = 0;
        int salary = 0;
        int totalWage = 0;
        int totalHrs = 0;
        int totalDays = 0;

        // loop condition to check if the total days are matching number of working days/hours and eventually calculate salary
        while (totalDays <= numberOfWorkingDays || totalHrs <= numberOfWorkingHours){

            totalDays++;

            // random numbers (0,1,2)
            int randomNum = (int)( Math.random() * 2 + 1);

            // selection statement
            if (randomNum == IS_FULL_TIME){
                empHours = 8;
            }
            else if (randomNum == IS_PART_TIME){
                empHours = 4;
            }
            else{
                empHours = 0;
            }

            // calculation of salary and hours
            totalHrs+=empHours;
            salary = empRate * empHours;
            totalWage+=salary;
        }
        System.out.println("Employee is in: " + companyName + ", Total salary: " + totalWage);
    }

    /**
     * The main method only calls the computeWages method declared above
     * @param args - main method
     */
    public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");

        // calling the method from above with the parameters declared
        computeWages("Company-A", 20, 5, 10);
        computeWages("Company-B", 25, 10, 20);
    }
}
