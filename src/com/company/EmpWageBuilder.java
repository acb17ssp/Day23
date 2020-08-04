package com.company;

public interface EmpWageBuilder {

    // methods
    void computeEmpWage();
    void addCompanyToArray(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours);
    int computeEmpWagesForACompany(ComputeEmployeeWage computeEmployeeWage);
}
