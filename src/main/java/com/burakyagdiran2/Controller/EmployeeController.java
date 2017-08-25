package com.burakyagdiran2.Controller;

import com.burakyagdiran2.Entity.Employee;
import com.burakyagdiran2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET) // Bütün çalışanları yazdırma
    public Collection<Employee> getAllEmployees(){

        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/{e_id}", method = RequestMethod.GET) // Id ye göre çalışan özelliklerini yazdırma
    public Employee getEmployeeById(@PathVariable("e_id") int e_id){

        return employeeService.getEmployeeById(e_id);
    }

    @RequestMapping(value = "/{e_id}", method = RequestMethod.DELETE) // Çalışanı silme
    public void deleteEmployeeById(@PathVariable("e_id") int e_id){

        employeeService.removeEmployeeById(e_id);
    }

    @RequestMapping(method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)// var olan çalışanın bilgilerini değiştirme
    public void updateEmployee(@RequestBody Employee employee){

        employeeService.updateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)// yeni bir çalışan oluşturma
    public void createEmployee(@RequestBody Employee employee){

        employeeService.createEmployee(employee);
    }

}
