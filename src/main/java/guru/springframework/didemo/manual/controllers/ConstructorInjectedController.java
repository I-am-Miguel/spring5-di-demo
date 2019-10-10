package guru.springframework.didemo.manual.controllers;

import guru.springframework.didemo.manual.service.HelloService;

public class ConstructorInjectedController {

    private HelloService helloService;

    public ConstructorInjectedController() {
    }

    public ConstructorInjectedController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.getHello();
    }
}
