package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("Employee")
    public Employee getEmployee(){
        Employee employee = new Employee(getDepDetails());
        employee.setEmpId(100);
        employee.setEmpName("Sam");
        employee.setEmpAddress("Maxican");
        return employee;

    }

    @Bean()
    public Department getDepDetails(){
        return new Department(1001,"Accounts");
    }
}
