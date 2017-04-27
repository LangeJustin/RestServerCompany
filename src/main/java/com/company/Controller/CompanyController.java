package com.company.Controller;

import com.company.Entity.Company;
import com.company.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Justin on 26.04.2017.
 */
@RestController
@RequestMapping ("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping (method = RequestMethod.GET)
    public Collection<Company> getCompanies(){
        return companyService.getCompanies();
    }
}
