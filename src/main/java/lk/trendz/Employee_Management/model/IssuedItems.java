package lk.trendz.Employee_Management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class IssuedItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String itemName;
    private String issueDate;
    private String returnDate;
    @ManyToOne
    private Employee employee;
}
