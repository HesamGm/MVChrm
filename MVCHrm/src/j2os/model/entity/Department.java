package j2os.model.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Table(name = "department_tbl")
@Entity(name = "department")
public class Department implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Version
    private long version;

    @Column(columnDefinition = "varchar2(20)")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK")
    private List<Employee> employee;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
