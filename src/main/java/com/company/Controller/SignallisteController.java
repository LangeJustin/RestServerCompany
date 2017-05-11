package com.company.Controller;

import com.company.Service.FeldbusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 05.05.17.
 */
@Controller
public class FeldbusController {
    @Autowired
    private FeldbusService feldbusService;

    @RequestMapping("/feldbus/all")
    public String feldbus(Model model){
        model.addAttribute("feldbus", feldbusService.getDaten());
        return "signalliste";
    }

}
