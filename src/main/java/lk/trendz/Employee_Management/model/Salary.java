package lk.trendz.Employee_Management.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salaryId;
    private double basicSalary;
    private double accommodationAllowance;
    private double transportationAllowance;
}
