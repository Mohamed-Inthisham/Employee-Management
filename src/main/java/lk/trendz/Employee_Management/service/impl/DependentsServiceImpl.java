package lk.trendz.Employee_Management.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lk.trendz.Employee_Management.controller.request.DependentsRequest;
import lk.trendz.Employee_Management.controller.response.DependentsResponse;
import lk.trendz.Employee_Management.controller.response.OutputMessageResponse;
import lk.trendz.Employee_Management.model.Dependents;
import lk.trendz.Employee_Management.model.Employee;
import lk.trendz.Employee_Management.repository.DependentsRepository;
import lk.trendz.Employee_Management.repository.EmployeeRepository;
import lk.trendz.Employee_Management.service.DependentsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DependentsServiceImpl implements DependentsService {
    private DependentsRepository dependentsRepository;
    private EmployeeRepository employeeRepository;

    @Override
    public DependentsResponse create(Long employeeId, DependentsRequest dependentsRequest) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() ->
                new EntityNotFoundException("Employee not found with id: " + employeeId));
        Dependents dependents = new Dependents();
        dependents.setName(dependentsRequest.getName());
        dependents.setRelationship(dependentsRequest.getRelationship());
        dependents.setAge(dependentsRequest.getAge());
        dependents.setEmployee(employee);
        dependentsRepository.save(dependents);
        DependentsResponse dependentsResponse = DependentsResponse.builder()
                .name(dependents.getName())
                .relationship(dependents.getRelationship())
                .age(dependents.getAge())
                .build();
        return dependentsResponse;
    }
    @Override
    public List<DependentsResponse> specificEmployeeDependents(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        employeeRepository.findById(employeeId).orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + employeeId));
        List<DependentsResponse> dependentsResponses = new ArrayList<>();
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            List<Dependents> dependentsList = employee.getDependents();
            for (Dependents dependents : dependentsList) {
                DependentsResponse dependentsResponse = DependentsResponse.builder()
                        .name(dependents.getName())
                        .age(dependents.getAge())
                        .relationship(dependents.getRelationship())
                        .build();
                dependentsResponses.add(dependentsResponse);
            }
            return dependentsResponses;
        }
        return null;
    }
    @Override
    public OutputMessageResponse delete(Long employeeId, Long dependentId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            List<Dependents> dependentsList = employee.getDependents();

            Dependents dependentToDelete = dependentsList.stream()
                    .filter(dependent -> dependent.getDependentId().equals(dependentId))
                    .findFirst()
                    .orElse(null);

            if (dependentToDelete != null) {
                dependentsList.remove(dependentToDelete);
                employeeRepository.save(employee);
                dependentsRepository.deleteById(dependentId);
                OutputMessageResponse outputMessageResponse = new OutputMessageResponse();
                outputMessageResponse.setMessage("Dependent Successfully deleted");
                outputMessageResponse.setEmpId(dependentId);
                return outputMessageResponse;
            }
            else {
                OutputMessageResponse outputMessageResponse = new OutputMessageResponse();
                outputMessageResponse.setMessage("Dependent not found for the given employee");
                return outputMessageResponse;
            }
        }
        else {
            OutputMessageResponse outputMessageResponse = new OutputMessageResponse();
            outputMessageResponse.setMessage("Employee not found");
            return outputMessageResponse;
        }
    }
    @Override
    public DependentsResponse update(Long employeeId, Long dependentId, DependentsRequest dependentsRequest) {
        Optional<Employee> optionalEmployee=employeeRepository.findById(employeeId);
        if(optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            List<Dependents> dependentsList = employee.getDependents();
            Dependents dependentsToUpdate = dependentsList.stream()
                    .filter(dependent -> dependent.getDependentId().equals(dependentId))
                    .findFirst()
                    .orElse(null);
            if (dependentsToUpdate != null) {
                dependentsList.add(dependentsToUpdate);
                dependentsToUpdate.setName(dependentsRequest.getName());
                dependentsToUpdate.setAge(dependentsRequest.getAge());
                dependentsToUpdate.setRelationship(dependentsRequest.getRelationship());
                employeeRepository.save(employee);
                DependentsResponse dependentsResponse = DependentsResponse.builder()
                        .name(dependentsToUpdate.getName())
                        .age(dependentsToUpdate.getAge())
                        .relationship(dependentsToUpdate.getRelationship())
                        .build();
                return dependentsResponse;
            }
        }
        return null;
    }
}

