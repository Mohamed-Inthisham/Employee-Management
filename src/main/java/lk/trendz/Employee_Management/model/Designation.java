package lk.trendz.Employee_Management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designationId;
    private String jobTitle;
    private String department;
    private String reportingManager;
    @OneToMany(mappedBy = "designation")
    private List<Employee> employees;
}
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "employee_id")
//    private Employee employee;