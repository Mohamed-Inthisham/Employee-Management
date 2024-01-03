package lk.trendz.Employee_Management.service.impl;

import com.fasterxml.jackson.core.PrettyPrinter;
import jakarta.persistence.EntityNotFoundException;
import lk.trendz.Employee_Management.controller.request.DependentsRequest;
import lk.trendz.Employee_Management.controller.response.DependentsResponse;
import lk.trendz.Employee_Management.model.Dependents;
import lk.trendz.Employee_Management.model.Employee;
import lk.trendz.Employee_Management.repository.DependentsRepository;
import lk.trendz.Employee_Management.repository.EmployeeRepository;
import lk.trendz.Employee_Management.service.DependentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DependentsServiceImpl implements DependentsService {
    @Autowired
    private DependentsRepository dependentsRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<DependentsResponse> create(Long id,DependentsRequest dependentsRequest) {
        List<DependentsResponse> dependentsResponseList=new ArrayList<>();
        Employee employee=employeeRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Employee not found with id: " + id));
        Dependents dependents=new Dependents();
        dependents.setName(dependentsRequest.getName());
        dependents.setRelationship(dependentsRequest.getRelationship());
        dependents.setAge(dependentsRequest.getAge());
        dependents.setEmployee(employee);
        dependentsRepository.save(dependents);
        DependentsResponse dependentsResponse=DependentsResponse.builder()
                .name(dependents.getName())
                .relationship(dependents.getRelationship())
                .age(dependents.getAge())
                .build();
        dependentsResponseList.add(dependentsResponse);
        return dependentsResponseList;
    }

}


