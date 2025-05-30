package com.controller;

import com.form.HomeForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class Home {

    private final HomeForm homeForm;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("demoForm", this.homeForm);
        return "index";
    }

}