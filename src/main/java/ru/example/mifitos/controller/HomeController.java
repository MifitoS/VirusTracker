package ru.example.mifitos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.example.mifitos.service.VirusDataService;

@Controller
public class HomeController {

    @Autowired
    VirusDataService virusDataService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStatistics",virusDataService.getAllStats());
        return "home";
    }
}
