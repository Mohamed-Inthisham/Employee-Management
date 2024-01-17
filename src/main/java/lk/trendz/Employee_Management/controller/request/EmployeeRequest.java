package lk.trendz.Employee_Management.controller.request;

import lombok.Data;

@Data
public class EmployeeRequest {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String dob;
    private Integer age;
    private String gender;
    private String nationality;
    private String address;
    private String maritalStatus;
    private String email;
    private String contactNumber;
}
