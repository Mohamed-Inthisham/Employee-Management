package lk.trendz.Employee_Management.controller;

import lk.trendz.Employee_Management.controller.request.DependentsRequest;
import lk.trendz.Employee_Management.controller.response.DependentsResponse;
import lk.trendz.Employee_Management.service.DependentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DependentsController {
    @Autowired
    private DependentsService dependentsService;
    @PostMapping("dependents/{employee-id}")
    public DependentsResponse create(@PathVariable("employee-id")Long id, @RequestBody DependentsRequest dependentsRequest){
        return dependentsService.create(id,dependentsRequest);
    }
    @GetMapping("/dependents/{employee-id}")
   public List<DependentsResponse> specificEmployeeDependents(@PathVariable("employee-id")Long id){
        return dependentsService.specificEmployeeDependents(id);
   }
}
