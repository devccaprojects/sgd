package com.ccaprojects.sgdapp.parameterservice;

import com.ccaprojects.sgdapp.parameterservice.bean.ParameterConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/parameter")
    public ParameterConfiguration retrieveLimitsFromConfigurations() {
        return new ParameterConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
