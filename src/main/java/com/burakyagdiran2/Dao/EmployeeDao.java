package com.burakyagdiran2.Dao;

import com.burakyagdiran2.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static Map<Integer , Employee> employees;

    static {

        employees = new HashMap<Integer, Employee>(){
            {
                put(1,new Employee(1,"Burak", "Yagdiran",5000));
                put(2,new Employee(2,"Orcun", "Firat",4000));
                put(3,new Employee(3,"Caglar", "Sak",3000));
            }
        };
    }

    public Collection<Employee> getAllEmployees(){

        return this.employees.values();
    }

    public Employee getEmployeeById(int e_id){

        return this.employees.get(e_id);
    }


    public void removeEmployeeById(int e_id) {

        this.employees.remove(e_id);
    }

    public void updateEmployee(Employee employee){

        Employee emp = employees.get(employee.getE_id());
        emp.setSalary(employee.getSalary());
        emp.setSurname(employee.getSurname());
        emp.setName(employee.getName());
        employees.put(employee.getE_id(),employee);

    }

    public void createEmployee(Employee employee){

        this.employees.put(employee.getE_id(), employee);
    }
}
