package com.seedfunder.service;

import com.seedfunder.model.Company;
import com.seedfunder.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    public Optional<Company> getCompany(Long id) {
        return companyRepository.findById(id);
    }

    public Company editCompany(Long id, Company updatedCompany) {
        return companyRepository.findById(id).map(company -> {
            company.setName(updatedCompany.getName());
            company.setEmail(updatedCompany.getEmail());
            company.setValuation(updatedCompany.getValuation());
            return companyRepository.save(company);
        }).orElseThrow(() -> new RuntimeException("Company not found"));
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}