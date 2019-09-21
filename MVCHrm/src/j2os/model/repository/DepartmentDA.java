package j2os.model.repository;

import j2os.model.entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class DepartmentDA {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void create(Department department){
    entityManager.persist(department);
    }
    @Transactional
    public void update(Department department){
    entityManager.merge(department);            //check Merge
    }
    @Transactional
    public void delete(long departmentID){
    Department department = entityManager.find(Department.class, departmentID);
    entityManager.remove(department);
    }
    public List<Department> select(){
        Query query = entityManager.createQuery("select entity from department entity");
        List<Department> departmentList = query.getResultList();
        return departmentList;
    }


}
