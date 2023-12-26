package lk.trendz.Employee_Management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designationId;
    private String jobTitle;
    private String department;
    private String reportingManager;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
