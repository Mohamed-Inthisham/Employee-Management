package lk.trendz.Employee_Management.controller.response;

import lombok.Data;

@Data
public class EmployeeResponse {
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
