package lk.trendz.Employee_Management.service.impl;

import lk.trendz.Employee_Management.controller.request.DesignationRequest;
import lk.trendz.Employee_Management.controller.response.DesignationResponse;
import lk.trendz.Employee_Management.model.Designation;
import lk.trendz.Employee_Management.repository.DesignationRepository;
import lk.trendz.Employee_Management.service.DesignationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DesignationServiceImpl implements DesignationService {

    private DesignationRepository designationRepository;
    @Override
    public DesignationResponse addDesignation(DesignationRequest designationRequest) {
        Designation designation=new Designation();
        designation.setJobTitle(designationRequest.getJobTitle());
        designation.setDepartment(designationRequest.getDepartment());
        designation.setReportingManager(designationRequest.getReportingManager());
        designationRepository.save(designation);

        DesignationResponse designationResponse=DesignationResponse.builder()
                .jobTitle(designation.getJobTitle())
                .department(designation.getDepartment())
                .reportingManager(designation.getReportingManager())
                .build();
        return designationResponse;
    }
}
