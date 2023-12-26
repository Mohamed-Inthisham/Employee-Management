package lk.trendz.Employee_Management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Leaves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveId;
    private String leaveType;
    private String leaveBalance;
    private String startDate;
    private String endDate;
    @ManyToOne
    private Employee employee;
}
