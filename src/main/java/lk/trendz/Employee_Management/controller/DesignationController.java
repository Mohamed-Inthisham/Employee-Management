package lk.trendz.Employee_Management.controller;

import lk.trendz.Employee_Management.controller.request.DesignationRequest;
import lk.trendz.Employee_Management.controller.response.DesignationResponse;
import lk.trendz.Employee_Management.service.DesignationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DesignationController {
    private DesignationService designationService;
    @PostMapping(value = "/designations",headers ="X-API-VERSION=1")
    public DesignationResponse addDesignation(@RequestBody DesignationRequest designationRequest){
        return designationService.addDesignation(designationRequest);
    }
}
