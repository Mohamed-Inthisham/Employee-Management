package lk.trendz.Employee_Management.controller;

import lk.trendz.Employee_Management.controller.request.EmployeeRequest;
import lk.trendz.Employee_Management.controller.response.EmployeeResponse;
import lk.trendz.Employee_Management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employees")
    public EmployeeResponse addEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.create(employeeRequest);
    }
}
