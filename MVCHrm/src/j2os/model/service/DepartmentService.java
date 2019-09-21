package j2os.model.service;

import j2os.model.entity.Department;
import j2os.model.entity.Employee;
import j2os.model.repository.DepartmentDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DepartmentService {
    @Autowired
    DepartmentDA departmentDA;

    public void create(Department department){

        departmentDA.create(department);
}

    public void update(Department department){
        departmentDA.update(department);
    }

    public void remove(long departmentID){
        departmentDA.delete(departmentID);
    }
    public List<Department> findAll(){
        return departmentDA.select();
    }
}
