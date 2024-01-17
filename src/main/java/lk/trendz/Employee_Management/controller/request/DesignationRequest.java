package lk.trendz.Employee_Management.controller.request;

import lombok.Data;

@Data
public class DesignationRequest {
    private String jobTitle;
    private String department;
    private String reportingManager;
}
