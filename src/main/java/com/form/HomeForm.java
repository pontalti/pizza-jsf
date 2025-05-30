package com.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class HomeForm {
    private String title = "PrimeFaces + Spring demo";
    private String demoPanel = "PrimeFaces + Spring demo";
    private String demoDescription = "Demo Spring boot + MVC + PrimeFaces.";
}