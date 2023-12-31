package lk.trendz.Employee_Management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long insuranceId;
    private double healthCoverage;
    private double lifeCoverage;
    private String policies;
    @ManyToOne
    private Employee employee;
}
