package com.bvr.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {

	public AdmissionsResource() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/physicians")
	public EmployeeList getPhysicians() {
		//EmployeeList physicians = restTemplate.getForObject("http://localhost:8082/hr/employees", EmployeeList.class);
		EmployeeList physicians = restTemplate.getForObject("http://hr-service/hr/employees", EmployeeList.class);
		return physicians;
	}
	
	@RequestMapping("/healthissues")
	public DiseaseList getDiseases() {
		//DiseaseList diseases = restTemplate.getForObject("http://localhost:8083/pathology/diseases", DiseaseList.class);
		DiseaseList diseases = restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseaseList.class);
		return diseases;
	}
}
