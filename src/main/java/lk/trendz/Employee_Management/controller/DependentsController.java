package lk.trendz.Employee_Management.controller;

import lk.trendz.Employee_Management.controller.request.DependentsRequest;
import lk.trendz.Employee_Management.controller.response.DependentsResponse;
import lk.trendz.Employee_Management.service.DependentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DependentsController {
    @Autowired
    private DependentsService dependentsService;
    @PostMapping("dependents/{employee-id}")
    public List<DependentsResponse> create(@PathVariable("employee-id")Long id, @RequestBody DependentsRequest dependentsRequest){
        return dependentsService.create(id,dependentsRequest);
    }
}
