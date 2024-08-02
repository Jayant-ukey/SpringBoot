package io.javabrains.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.CompanyRepo;
import io.javabrains.entity.Company;


@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepo companyRepo;

	public List<Company> getAllCompanies() {
		List<Company> companies = new ArrayList<Company>();
		companyRepo.findAll().forEach(companies :: add);
		return companies;
	}

	public Company addComapny(Company company) {
		company.setCreationDate(new Date());
		return companyRepo.save(company);
	}
	
	
	//Need to work on it. Not getting creation date
	public Company updateCompany(Company company, int id) {
//		Company existingCompany = companyRepo.findById(id).orElseThrow(()-> NotFoundException(""));
		return companyRepo.save(company);
	}
	
	public void deleteCompany(int id) {
		 companyRepo.deleteById(id);
	}

	public Optional<Company> getCompany(int id) {
		return companyRepo.findById(id);
	}

}
