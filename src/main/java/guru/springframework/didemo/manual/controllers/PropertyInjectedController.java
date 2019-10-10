package guru.springframework.didemo.manual.controllers;

import guru.springframework.didemo.manual.service.HelloService;

public class PropertyInjectedController {

    public HelloService helloService;

    public String sayHello() {
        return helloService.getHello();
    }
}
