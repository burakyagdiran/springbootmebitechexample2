package com.burakyagdiran2.Service;

import com.burakyagdiran2.Dao.EmployeeDao;
import com.burakyagdiran2.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployees(){

        return employeeDao.getAllEmployees();
    }

    public Employee getEmployeeById(int e_id){

        return this.employeeDao.getEmployeeById(e_id);
    }

    public void  removeEmployeeById (int e_id){

        this.employeeDao.removeEmployeeById(e_id);
    }

    public void updateEmployee(Employee employee){

       this.employeeDao.updateEmployee(employee);
    }

    public void createEmployee(Employee employee){

        this.employeeDao.createEmployee(employee);
    }
}
