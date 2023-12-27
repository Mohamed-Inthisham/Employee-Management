package lk.trendz.Employee_Management.repository;

import lk.trendz.Employee_Management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}