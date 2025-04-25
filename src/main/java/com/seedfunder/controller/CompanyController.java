package com.seedfunder.controller;

import com.seedfunder.model.Company;
import com.seedfunder.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> addCompany(@RequestBody Company company) {
        Company savedCompany = companyService.addCompany(company);
        return ResponseEntity.status(201).body(savedCompany);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable Long id) {
        Optional<Company> company = companyService.getCompany(id);
        return company.map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> editCompany(@PathVariable Long id, @RequestBody Company updatedCompany) {
        try {
            Company company = companyService.editCompany(id, updatedCompany);
            return ResponseEntity.ok(company);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }
}