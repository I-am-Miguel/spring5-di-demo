package guru.springframework.didemo.manual.controllers;

import guru.springframework.didemo.service.HelloService;

public class ManuallyConstructorInjectedController {

    private HelloService helloService;

    public ManuallyConstructorInjectedController() {
    }

    public ManuallyConstructorInjectedController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.getHello();
    }
}
