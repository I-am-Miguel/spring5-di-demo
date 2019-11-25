package guru.springframework.didemo.manual.controllers;

import guru.springframework.didemo.service.HelloService;

public class ManuallyPropertyInjectedController {

    public HelloService helloService;

    public String sayHello() {
        return helloService.getHello();
    }
}
