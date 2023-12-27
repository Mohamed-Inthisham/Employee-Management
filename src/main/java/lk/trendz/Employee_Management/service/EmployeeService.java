package lk.trendz.Employee_Management.service;

import lk.trendz.Employee_Management.controller.request.EmployeeRequest;
import lk.trendz.Employee_Management.controller.response.EmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeResponse create(EmployeeRequest employeeRequest);
    List<EmployeeResponse> getAll(EmployeeRequest employeeRequest);
    EmployeeResponse specificEmployeeDetails(Long id);
}
