package j2os.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "employee")
@Entity(name = "employee")
public class Employee implements Serializable {

    public Employee() {
        hireDate = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private long id;

    @Version
    private long version;

    @Column(columnDefinition = "varchar2(20)")
    private String firstName;

    @Column(columnDefinition = "varchar2(20)")
    private String lastName;

//    @Column(columnDefinition = "varchar2(20)")
//    private String job;
//
//    private int salary;
//
//    @Column(columnDefinition = "varchar2(20)")
//    private String employmentType;
//
//    private short age;
//
//    @Column(columnDefinition = "varchar2(20)")
//    private String phoneNumber;

    private Date hireDate;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public String getEmploymentType() {
//        return employmentType;
//    }
//
//    public void setEmploymentType(String employmentType) {
//        this.employmentType = employmentType;
//    }
//
//    public short getAge() {
//        return age;
//    }
//
//    public void setAge(short age) {
//        this.age = age;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}


