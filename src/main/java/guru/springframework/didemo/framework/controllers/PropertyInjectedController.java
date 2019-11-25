package guru.springframework.didemo.framework.controllers;

import guru.springframework.didemo.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public HelloService helloService;

    public String sayHello() {
        return helloService.getHello();
    }
}
