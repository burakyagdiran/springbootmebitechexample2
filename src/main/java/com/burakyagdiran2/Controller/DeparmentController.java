package com.burakyagdiran2.Controller;


import com.burakyagdiran2.Entity.Department;
import com.burakyagdiran2.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/departments")
public class DeparmentController {

    @Autowired
    private DepartmentService  departmentService;

    @RequestMapping(method = RequestMethod.GET) // Bütün departmanları yazdırma
    public Collection<Department> getAllDepartments(){

        return departmentService.getAllDepartments();
    }

    @RequestMapping(value = "/{d_id}", method = RequestMethod.GET) // Id ye göre departman özelliklerini yazdırma
    public Department DepartmentById(@PathVariable("d_id") int d_id){

        return departmentService.getDepartmentById(d_id);
    }

    @RequestMapping(value = "/{d_id}", method = RequestMethod.DELETE) // Departmanı silme
    public void removeDepartment(@PathVariable("d_id") int d_id){

        departmentService.deleteDepartment(d_id);
    }

    @RequestMapping(method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)// departman bilgilerini değiştirme
    public void updateDepartment(@RequestBody Department department){

        departmentService.updateDepartment(department);
    }

    @RequestMapping(method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)// yeni departman oluşturma
    public void createDepartment(@RequestBody Department department){

        departmentService.createDepartment(department);
    }

}
