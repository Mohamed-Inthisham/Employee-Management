package lk.trendz.Employee_Management.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String nationality;
    private String maritalStatus;
    private String email;
    private String contactNumber;
}
