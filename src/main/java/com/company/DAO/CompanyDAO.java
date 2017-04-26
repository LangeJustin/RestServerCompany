package com.company.DAO;

import com.company.Entity.Company;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Justin on 26.04.2017.
 */
@Repository
public class CompanyDAO {

        private static Map<Integer, Company> companies;

        static {
            companies = new HashMap<Integer, Company>(){

                {
                    put (1, new Company(1, "Audi", "Automobile"));
                }

                {
                    put (2, new Company(2, "BMW", "Automobile"));
                }

                {
                    put (3, new Company(3, "H&K", "Weapons"));
                }

            };
        }

        public Collection<Company> getCompanies(){
            return this.companies.values();
        }
}
