package lk.trendz.Employee_Management.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DependentsResponse {
    private String name;
    private String relationship;
    private Integer age;
}
