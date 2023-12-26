package lk.trendz.Employee_Management.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;
    private String qualification;
    private String institution;
    private String degree;
    private Integer graduationYear;
}
