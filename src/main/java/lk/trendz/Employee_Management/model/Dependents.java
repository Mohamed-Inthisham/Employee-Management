package lk.trendz.Employee_Management.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Dependents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dependentId;
    private String name;
    private String relationship;
}
