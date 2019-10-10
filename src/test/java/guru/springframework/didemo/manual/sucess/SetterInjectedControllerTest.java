package guru.springframework.didemo.manual.sucess;

import guru.springframework.didemo.manual.controllers.SetterInjectedController;
import guru.springframework.didemo.manual.service.HelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    public void setup() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setHelloService(new HelloServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals(HelloServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
