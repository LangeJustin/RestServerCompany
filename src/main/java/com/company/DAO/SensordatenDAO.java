package com.company.DAO;

import com.company.Entity.Sensordaten;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 05.05.17.
 */
@Repository
public class SensordatenDAO {
    private static Map<Integer, Sensordaten> sensordaten;

    static {
        sensordaten = new HashMap<Integer, Sensordaten>(){

            {
                put (1, new Sensordaten(1, "Spindel - oben", "18kHz", "AC", "Beschl."));
            }

            {
                put (2, new Sensordaten(2, "Spindelmutter", "10kHz", "AC", "Drehmoment"));
            }

            {
                put (3, new Sensordaten(3, "Antrieb", "24kHz", "AC", "usw"));
            }

            {
                put (4, new Sensordaten(4, "Walze vorne", "4kHz", "AC", "-"));
            }

            {
                put (5, new Sensordaten(5, "Walze hinten", "1kHz", "AC", "-"));
            }

            {
                put (6, new Sensordaten(6, "Kühlmitteldruck", "20Hz", "DC", "-"));
            }

        };
    }

    public Collection<Sensordaten> getDaten(){
        return this.sensordaten.values();
    }
}
