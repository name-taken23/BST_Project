package com.james.bstProject.employeeListProject;

import com.james.bstProject.App;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public interface EmployeeCsvService {
  Logger LOGGER = LogManager.getLogger(App.class);
  /*

   */
   static void employeeCSVGetterAndStore(int numberOfEmployeesToGet){
    try {
      String result[] = EmployeeFactory.getEmployees(numberOfEmployeesToGet);
      Employee temp;
      for(String data: result) {
        temp = EmployeeConverter.createEmployeeFromData(data);
        EmployeeStorage.getEmployeeStorage().addEmployeeToList(temp);
      }
    } catch (IOException e) {
      LOGGER.error(e.getMessage(), e);
    } catch (RuntimeException e){
      LOGGER.error(e.getMessage(), e);
    }
  }
}
