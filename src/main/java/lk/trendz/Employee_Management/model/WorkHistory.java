package lk.trendz.Employee_Management.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "WorkHistory ")
public class WorkHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workHistoryId;
    private String pwPlace;         // previous work place
    private String jobTitle;
    private String ePeriod;         // employment period
    @ManyToOne
    private Employee employee;
}
