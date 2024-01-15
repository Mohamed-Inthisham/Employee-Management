package lk.trendz.Employee_Management.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String dob;
    private Integer age;
    private String gender;
    private String nationality;
    private String address;
    private String maritalStatus;
    private String email;
    private String contactNumber;
    @OneToMany(mappedBy = "employee")
    private List<Education> educations;
    @OneToMany(mappedBy = "employee")
    private List<Dependents> dependents;
    @OneToMany(mappedBy = "employee")
    private List<EmergencyContact> emergencyContacts;
    @OneToMany(mappedBy = "employee")
    private List<Insurance> insurances;
    @OneToMany(mappedBy = "employee")
    private List<IssuedItems> issuedItems;
    @OneToMany(mappedBy = "employee")
    private List<Leaves> leaves;
    @OneToMany(mappedBy = "employee")
    private List<Salary> salaries;
    @OneToMany(mappedBy = "employee")
    private List<WorkHistory> workHistories;
    @ManyToOne
    @JoinColumn(name = "designationId")
    private Designation designation;
}
