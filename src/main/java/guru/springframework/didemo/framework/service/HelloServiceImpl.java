package guru.springframework.didemo.framework.service;

import guru.springframework.didemo.service.HelloService;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public static String HELLO = "Hello World";

    @Override
    public String getHello() {
        return HELLO;
    }
}
