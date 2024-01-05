package lk.trendz.Employee_Management.controller;

import lk.trendz.Employee_Management.controller.request.DependentsRequest;
import lk.trendz.Employee_Management.controller.response.DependentsResponse;
import lk.trendz.Employee_Management.controller.response.OutputMessageResponse;
import lk.trendz.Employee_Management.service.DependentsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DependentsController {
    private DependentsService dependentsService;
    @PostMapping("dependents/{employee-id}")
    public DependentsResponse create(@PathVariable("employee-id")Long id, @RequestBody DependentsRequest dependentsRequest){
        return dependentsService.create(id,dependentsRequest);
    }
    @GetMapping("/dependents/{employee-id}")
   public List<DependentsResponse> specificEmployeeDependents(@PathVariable("employee-id")Long id){
        return dependentsService.specificEmployeeDependents(id);
   }
   @DeleteMapping("/dependents/{employee-id}/{dependent-id}")
   public OutputMessageResponse delete(@PathVariable("employee-id")Long employeeId,@PathVariable("dependent-id")Long dependentId){
        return dependentsService.delete(employeeId,dependentId);

   }
   @PutMapping("/dependents/{employee-id}/{dependent-id}")
   public DependentsResponse update(@PathVariable("employee-id")Long employeeId,
                                    @PathVariable("dependent-id")Long dependentId,
                                    @RequestBody DependentsRequest dependentsRequest){
      return dependentsService.update(employeeId,dependentId,dependentsRequest);
   }
}
