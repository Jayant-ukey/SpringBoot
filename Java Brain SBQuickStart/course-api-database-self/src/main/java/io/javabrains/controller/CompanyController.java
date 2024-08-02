package io.javabrains.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.entity.Company;
import io.javabrains.service.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("")
	public ResponseEntity<List<Company>> getAllCompanies(){
		return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("{id}")
	 public ResponseEntity<Optional<Company>> getCompany(@PathVariable int id){
		return new ResponseEntity<>(companyService.getCompany(id), HttpStatus.ACCEPTED);
	}

	@PostMapping("")
	public ResponseEntity<Company> addCompany(@RequestBody Company company){
		return new ResponseEntity<>(companyService.addComapny(company), HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Company> updateCompany(@RequestBody Company company, @PathVariable int id){
		return new ResponseEntity<>(companyService.updateCompany(company, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteComapny(@PathVariable int id) {
		 companyService.deleteCompany(id);
		 return new ResponseEntity<>("Successfully Deleted", HttpStatus.OK);
	}
	
}
