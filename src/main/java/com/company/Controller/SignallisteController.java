package com.company.Controller;

import com.company.Service.FeldbusService;
import com.company.Service.SensordatenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.zeromq.ZMQ;
//import org.zeromq.ZMQ.Context;
//import org.zeromq.ZMQ.Socket;

import java.util.ArrayList;

/**
 * Created by user on 05.05.17.
 */
@Controller
public class SignallisteController {
    @Autowired
    private FeldbusService feldbusService;
    @Autowired
    private SensordatenService sensordatenService;

    @RequestMapping("/signalliste")
    public String signalliste(Model model){
        model.addAttribute("feldbus", feldbusService.getDaten());
        model.addAttribute("sensordaten", sensordatenService.getDaten());
        return "signalliste";

    }

    @RequestMapping("/zmq")
    public String zmq(Model model){
        //TODO: zmq
        int k = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        long startTime = System.currentTimeMillis(); //fetch starting time
        while(false||(System.currentTimeMillis()-startTime)<0.5)
        {
            // do something
            myList.add(k);
            ++k;
        }
        model.addAttribute("myList", myList );

        //return "test";
        return "allcompanies";

    }

}
