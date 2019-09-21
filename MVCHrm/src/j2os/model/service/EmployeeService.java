package j2os.model.service;

import j2os.model.entity.Employee;
import j2os.model.repository.EmployeeDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDA employeeDA;

    public void add(Employee employee, long DepartmentId){
        employeeDA.add(DepartmentId, employee);
    }

    public void update(Employee employee){
        employeeDA.update(employee);
    }

    public void remove(long departmentId){
         employeeDA.delete(departmentId);
    }

    public List<Employee> select(){
        return employeeDA.findAll();
    }
}
