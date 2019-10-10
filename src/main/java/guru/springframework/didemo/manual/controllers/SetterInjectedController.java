package guru.springframework.didemo.manual.controllers;

import guru.springframework.didemo.manual.service.HelloService;

public class SetterInjectedController {

    private HelloService helloService;

    public SetterInjectedController() {
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.getHello();
    }
}
