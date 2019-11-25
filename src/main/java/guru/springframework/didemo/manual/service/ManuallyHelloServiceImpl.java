package guru.springframework.didemo.manual.service;

import guru.springframework.didemo.service.HelloService;

public class ManuallyHelloServiceImpl implements HelloService {
    public static String HELLO = "Hello World";

    @Override
    public String getHello() {
        return HELLO;
    }
}
