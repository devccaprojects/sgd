package com.ccaprojects.sgdapp.contractservice;

import com.ccaprojects.sgdapp.contractservice.controller.ClientBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "client-service", url = "localhost:8000")
//@FeignClient(name = "client-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "client-service")
public interface ClientServiceProxy {

    //@GetMapping("/client/id/{id}")
    @GetMapping("/client-service/client/id/{id}")
    ClientBean getClient(@PathVariable("id") Integer id);
}
