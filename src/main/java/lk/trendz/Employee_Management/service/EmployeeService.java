package lk.trendz.Employee_Management.service;

import lk.trendz.Employee_Management.controller.request.EmployeeRequest;
import lk.trendz.Employee_Management.controller.response.EmployeeResponse;
import lk.trendz.Employee_Management.controller.response.OutputMessageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeResponse create(Long designationId,EmployeeRequest employeeRequest);
    List<EmployeeResponse> getAll(EmployeeRequest employeeRequest);
    EmployeeResponse specificEmployeeDetails(Long id);
    OutputMessageResponse delete(Long id);
    EmployeeResponse update(Long id,EmployeeRequest employeeRequest);
}
