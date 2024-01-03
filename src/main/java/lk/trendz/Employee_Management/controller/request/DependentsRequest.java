package lk.trendz.Employee_Management.controller.request;

import lombok.Data;

@Data
public class DependentsRequest {
    private Long dependentId;
    private String name;
    private String relationship;
    private Integer age;
}
