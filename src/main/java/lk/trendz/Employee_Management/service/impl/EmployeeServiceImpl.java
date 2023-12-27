package lk.trendz.Employee_Management.service.impl;

import lk.trendz.Employee_Management.controller.request.EmployeeRequest;
import lk.trendz.Employee_Management.controller.response.EmployeeResponse;
import lk.trendz.Employee_Management.model.Employee;
import lk.trendz.Employee_Management.repository.EmployeeRepository;
import lk.trendz.Employee_Management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeResponse create(EmployeeRequest employeeRequest) {
        Employee employee=new Employee();
        employee.setFirstName(employeeRequest.getFirstName());
        employee.setLastName(employeeRequest.getLastName());
        employee.setDob(employeeRequest.getDob());
        employee.setGender(employeeRequest.getGender());
        employee.setNationality(employeeRequest.getNationality());
        employee.setAddress(employeeRequest.getAddress());
        employee.setMaritalStatus(employeeRequest.getMaritalStatus());
        employee.setEmail(employeeRequest.getEmail());
        employee.setContactNumber(employeeRequest.getContactNumber());
        employeeRepository.save(employee);

        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setFirstName(employee.getFirstName());
        employeeResponse.setLastName(employee.getLastName());
        employeeResponse.setDob(employee.getDob());
        employeeResponse.setGender(employee.getGender());
        employeeResponse.setNationality(employee.getNationality());
        employeeResponse.setAddress(employee.getAddress());
        employeeResponse.setMaritalStatus(employee.getMaritalStatus());
        employeeResponse.setEmail(employee.getEmail());
        employeeResponse.setContactNumber(employee.getContactNumber());
        return employeeResponse;
    }
}