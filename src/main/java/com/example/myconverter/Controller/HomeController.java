package com.example.myconverter.Controller;

import com.example.myconverter.model.Temperature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

        @GetMapping("/")
        public String index(){
            return "home/index";
        }

        @PostMapping("/index")
        public String celData(WebRequest wR, @ModelAttribute Temperature temp, Model model){
            String button = (wR.getParameter("type"));
            System.out.println(button);
            if(button.equals("F2C")) {
                temp.setCelsius((temp.getTemparture() - 32) * 5/ 9);
                model.addAttribute("res", temp.getCelsius());
            } else {
                temp.setFahrenheit(temp.getTemparture()* 2 + 32);
                model.addAttribute("res", temp.getFahrenheit());
            }
            return "home/index";
        }


    /*@PostMapping("/contemp")
    public String fahData(@ModelAttribute Temperature temp, Model model){
        model.addAttribute("Fahrenheit", temp);
        temp.setFahrenheit(temp.getTemparture() * 2 + 32);
        return "home/contemp";
    }*/



}
