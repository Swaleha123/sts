package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.CompanyRepository;
import com.cts.pojos.Company;

@RequestMapping("/ManageCompany")
@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepository;
	@RequestMapping("/getAllcompany")

	public Iterable<Company> getAllcompany()
	{
		return companyRepository.findAll();
	}

	@PostMapping("/savecompany")
	public Company savecompany(@RequestBody Company company)
	{
		System.out.println(company);
		companyRepository.save(company);
		return company;
	}

	@PutMapping("/updateCompany/{companyName}")
	public Company updateCompany(@RequestBody Company company,@PathVariable("companyName") String companyName)
	{
		company.setCompanyName(companyName);
		System.out.println(company);
		companyRepository.save(company);
		return company;
	}
	
	 @DeleteMapping("/deleteCompany/{companyName}")
	 public boolean deleteCompany(@PathVariable("companyName") String companyname)
	 {
	  System.out.println(companyname);
	  companyRepository.deleteById(companyname);
	  return true;
	 }

	 @GetMapping("/findOneInAll7/{companyName}")
	 public Company findoneinall(@PathVariable("companyName") String companyname)
	 {
	  Optional<Company> company= companyRepository.findById(companyname);
	  return company.get();
	 }
}
