package lk.trendz.Employee_Management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;
    private String contactName;
    private String relationship;
    private String contactNumber;
    @ManyToOne
    private Employee employee;
}
