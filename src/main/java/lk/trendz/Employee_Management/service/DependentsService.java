package lk.trendz.Employee_Management.service;

import lk.trendz.Employee_Management.controller.request.DependentsRequest;
import lk.trendz.Employee_Management.controller.response.DependentsResponse;
import lk.trendz.Employee_Management.controller.response.OutputMessageResponse;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface DependentsService {
    DependentsResponse create(Long employeeId,DependentsRequest dependentsRequest);
    List<DependentsResponse> specificEmployeeDependents(Long employeeId);
    OutputMessageResponse delete(Long employeeId,Long dependentId);
//    DependentsResponse update(Long employeeId,DependentsRequest dependentsRequest);
}
