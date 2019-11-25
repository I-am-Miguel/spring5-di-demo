package guru.springframework.didemo.manual.controllers;

import guru.springframework.didemo.service.HelloService;

public class ManuallySetterInjectedController {

    private HelloService helloService;

    public ManuallySetterInjectedController() {
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.getHello();
    }
}
