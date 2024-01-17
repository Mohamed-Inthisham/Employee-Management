package lk.trendz.Employee_Management.controller.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DesignationResponse {
    private String jobTitle;
    private String department;
    private String reportingManager;
}
