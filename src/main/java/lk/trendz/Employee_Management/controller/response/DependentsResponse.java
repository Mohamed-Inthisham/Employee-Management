package lk.trendz.Employee_Management.controller.response;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class DependentsResponse {
    private String name;
    private String relationship;
    private Integer age;
}
