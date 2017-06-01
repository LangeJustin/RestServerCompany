package com.company.Service;

import com.company.DAO.FeldbusDAO;
import com.company.Entity.Feldbus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by user on 05.05.17.
 */
@Service
public class FeldbusService {

    @Autowired
    private FeldbusDAO felbusDAO;

    public Collection<Feldbus> getDaten(){return felbusDAO.getDaten();}
}
