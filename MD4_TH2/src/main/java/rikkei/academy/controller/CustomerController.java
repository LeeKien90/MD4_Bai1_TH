package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("views")
public class CustomerController {
    @RequestMapping("list")
    public String list(){
        return "list";
    }
    @RequestMapping("info")
    public String info(){
        return "info";
    }
}
