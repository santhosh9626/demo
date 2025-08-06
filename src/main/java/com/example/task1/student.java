package com.example.task1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class student {
 
    @RequestMapping("show")
    
    String king(){
        return "button";
    }


    @RequestMapping("btnn")
    String btnn(){
        return "details";
    }

    @RequestMapping("last")
    String last(@RequestParam String name,String email,String phone,String DOB,Model s){

        s.addAttribute("name", name);
        s.addAttribute("email", email);
        s.addAttribute("phone", phone);
        s.addAttribute("DOB", DOB);

        return "datas";

    }

}
