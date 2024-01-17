package lk.trendz.Employee_Management.service;

import lk.trendz.Employee_Management.controller.request.DesignationRequest;
import lk.trendz.Employee_Management.controller.response.DesignationResponse;
import org.springframework.stereotype.Service;

@Service
public interface DesignationService {

    DesignationResponse addDesignation(DesignationRequest designationRequest);
}
