package j2os.model.repository;

import j2os.model.entity.Department;
import j2os.model.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDA {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void add(long departmentId, Employee employee){
        Department department = entityManager.find(Department.class , departmentId);
        List<Employee> employeeList = department.getEmployee();
        employeeList.add(employee);
        department.setEmployee(employeeList);
        entityManager.persist(department);
    }
    @Transactional
    public void update(Employee employee){
        entityManager.find(Employee.class, employee.getId());
        entityManager.persist(employee);
    }
    @Transactional
    public void delete(long employeeID){
        Employee employee = entityManager.find(Employee.class, employeeID);
        entityManager.remove(employee);
    }
    
    public List<Employee> findAll(){
        Query query = entityManager.createQuery("select entity from department entity join fetch entity.employee");
        List<Employee> employeeList = query.getResultList();
        return employeeList;
    }
}
