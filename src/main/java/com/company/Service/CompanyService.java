package com.company.Service;

import com.company.DAO.CompanyDAO;
import com.company.Entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Justin on 26.04.2017.
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyDAO companyDAO;

    public Collection<Company> getCompanies(){
        return companyDAO.getCompanies();
    }

    public Company findById (int id){
        for(Company company :  companyDAO.getCompanies()){
            if(company.getId() == id)
                return company;
        }
        return null;
    }

}
