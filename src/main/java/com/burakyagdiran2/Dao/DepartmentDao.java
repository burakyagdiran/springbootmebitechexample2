package com.burakyagdiran2.Dao;


import com.burakyagdiran2.Entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    private static Map< Integer, Department > departments;

    static {

        departments = new HashMap<Integer, Department>(){

            {
                put(1,new Department(1,"Menagement", "Project Manager","Burak Yagdiran"));
                put(2,new Department(2,"Software", "Software Developer","Orcun Firat"));
                put(3,new Department(3,"Design", "Designer","Caglar Sak"));
            }
        };
    }

    public Collection< Department> getAllDepartments (){

        return this.departments.values();
    }

    public Department getDepartmentById(int d_id){

        return this.departments.get(d_id);
    }

    public void deleteDepartment(int e_id) {

        this.departments.remove(e_id);
    }

    public void updateDepartment(Department department){

        Department dep = departments.get(department.getD_id());
        dep.setD_employee(department.getD_employee());
        dep.setDescription(department.getDescription());
        dep.setD_name(department.getD_name());
        departments.put(department.getD_id(),department);

    }


    public void createDepartment(Department department){

        this.departments.put(department.getD_id(),department);
    }
}
