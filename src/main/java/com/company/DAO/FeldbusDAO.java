package com.company.DAO;

import com.company.Entity.Feldbus;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 05.05.17.
 */
@Repository
public class FeldbusDAO {

    private static Map<Integer, Feldbus> feldbusse;

    static {
        feldbusse = new HashMap<Integer, Feldbus>(){

            {
                put (1, new Feldbus(1, "Motorstrom", "DWord", 276, 12, true));
            }

            {
                put (2, new Feldbus(2, "Ventil auf", "Bool", 307.1, 3, false));
            }

            {
                put (3, new Feldbus(3, "Kuka status", "Byte", 1200, 1.5, true));
            }

            {
                put (4, new Feldbus(4, "Förder 1 an", "Bool", 307.3, 12, true));
            }

            {
                put (5, new Feldbus(5, "Förder 2 an", "Bool", 307.4, 12, true));
            }

            {
                put (6, new Feldbus(6, "Motorstrom", "DWord", 276, 12, true));
            }

            {
                put (7, new Feldbus(7, "Ventil auf", "Bool", 307.1, 3, false));
            }

            {
                put (8, new Feldbus(8, "Kuka status", "Byte", 1200, 1.5, true));
            }

            {
                put (9, new Feldbus(9, "Förder 1", "Bool", 307.3, 12, true));
            }

            {
                put (10, new Feldbus(10, "Förder 2", "Bool", 307.4, 12, true));
            }

            {
                put (11, new Feldbus(11, "Date_Time", "DT", 100, 10, false));
            }

        };
    }

    public Collection<Feldbus> getDaten(){
        return this.feldbusse.values();
    }
}
