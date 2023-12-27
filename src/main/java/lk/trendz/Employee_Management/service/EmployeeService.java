package lk.trendz.Employee_Management.service;

import lk.trendz.Employee_Management.controller.request.EmployeeRequest;
import lk.trendz.Employee_Management.controller.response.EmployeeResponse;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeResponse create(EmployeeRequest employeeRequest);
}
