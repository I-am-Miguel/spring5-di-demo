package guru.springframework.didemo.manual.service;

public class HelloServiceImpl implements HelloService {
    public static String HELLO = "Hello World";

    @Override
    public String getHello() {
        return HELLO;
    }
}
