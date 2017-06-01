package com.company.Controller;

import com.company.Entity.Company;
import com.company.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by Justin on 26.04.2017.
 */
//TODO: Restcontroller integrieren
//@RestController
@Controller
//@RequestMapping(value = "companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    // TODO: später zmq einbinden. (Daten von zmq im Model übergeben)
    @RequestMapping (value = "/companies")
    public String getCompanies(Model model){
        //Collection<Company> companies = companyService.getCompanies();
        model.addAttribute("company", "company, yeaaaaaaaaaaaaaaaaaaaaaaaaaah!");

        return "test";
    }


    @RequestMapping("/companies/{id}")
    public String company(@PathVariable int id, ModelMap modelMap){
        Company company = companyService.findById(id);
        modelMap.put("getcompany", company);

        return "companyid";
    }

    @RequestMapping("/companies/all")
    public String company(Model model){
        model.addAttribute("companies", companyService.getCompanies());

        return "allcompanies";
    }


}
