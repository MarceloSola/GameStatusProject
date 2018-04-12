package com.friendsgroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Endpoint {
    @RequestMapping("/")
    @ResponseBody
    public String consulta(){
        return "Prueba";
    }
}
