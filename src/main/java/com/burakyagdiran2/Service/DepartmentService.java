package com.burakyagdiran2.Service;


import com.burakyagdiran2.Dao.DepartmentDao;
import com.burakyagdiran2.Entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public Collection<Department> getAllDepartments(){

        return departmentDao.getAllDepartments();
    }

    public Department getDepartmentById(int d_id){

        return this.departmentDao.getDepartmentById(d_id);
    }

    public void  deleteDepartment (int d_id){

        this.departmentDao.deleteDepartment(d_id);
    }

    public void updateDepartment(Department department){

        this.departmentDao.updateDepartment(department);
    }

    public void createDepartment(Department department){

        this.departmentDao.createDepartment(department);
    }

}
