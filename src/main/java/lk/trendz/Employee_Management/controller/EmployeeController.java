package lk.trendz.Employee_Management.controller;

import lk.trendz.Employee_Management.controller.request.EmployeeRequest;
import lk.trendz.Employee_Management.controller.response.EmployeeResponse;
import lk.trendz.Employee_Management.controller.response.OutputMessageResponse;
import lk.trendz.Employee_Management.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping("/employees")
    public EmployeeResponse addEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.create(employeeRequest);
    }
    @GetMapping("/employees")
    public List<EmployeeResponse> getAllEmployees(EmployeeRequest employeeRequest){
        return employeeService.getAll(employeeRequest);
    }
    @GetMapping("/employees/{employee-id}")
    public EmployeeResponse specificEmployeeDetails(@PathVariable("employee-id")Long id){
        return employeeService.specificEmployeeDetails(id);
    }
    @DeleteMapping("/employees/{employee-id}")
    public OutputMessageResponse deleteEmployee(@PathVariable("employee-id")Long id){
        return employeeService.delete(id);
    }
    @PutMapping("/employees/{employee-id}")
    public EmployeeResponse updateEmployee(@PathVariable("employee-id")Long id,@RequestBody EmployeeRequest employeeRequest){
        return employeeService.update(id, employeeRequest);
    }
}
