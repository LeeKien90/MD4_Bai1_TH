package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("helloWorld")
public class HelloWorld {
    @RequestMapping("hello1")
    public String helloJava8(){
        return "hello";
    }
}
