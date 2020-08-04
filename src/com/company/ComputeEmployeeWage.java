package com.company;

public class ComputeEmployeeWage {

    public final String companyName;
    public final int empRate;
    public final int numberOfWorkingDays;
    public final int numberOfWorkingHours;
    public int totalWage;


    /**
     * @param companyName - name of the company
     * @param empRate - rate of the employee per hr
     * @param numberOfWorkingDays - total number of working days
     * @param numberOfWorkingHours - total number of working hours
     */
    public ComputeEmployeeWage(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours) {
        this.companyName = companyName;
        this.empRate = empRate;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.numberOfWorkingHours = numberOfWorkingHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String toString(){
        return "Total Employee Wage for Company: " + companyName + " is: " + totalWage;
    }
}
