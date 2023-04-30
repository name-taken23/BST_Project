package com.james.bstProject.userInterface;

import com.james.bstProject.employeeListProject.Employee;

interface UserPrinter {
    //Interface for printing Employee and their details
     static void printUser(Employee employee) {
        System.out.println(employee.toString());
    }

}
