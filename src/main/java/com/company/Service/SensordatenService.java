package com.company.Service;

import com.company.DAO.SensordatenDAO;
import com.company.Entity.Sensordaten;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by user on 05.05.17.
 */
@Service
public class SensordatenService {

    @Autowired
    private SensordatenDAO sensordatenDAO;

    public Collection<Sensordaten> getDaten(){
        return sensordatenDAO.getDaten();
    }
}
