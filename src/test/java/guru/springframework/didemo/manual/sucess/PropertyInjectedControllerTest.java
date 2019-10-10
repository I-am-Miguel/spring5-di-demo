package guru.springframework.didemo.manual.sucess;

import guru.springframework.didemo.manual.controllers.PropertyInjectedController;
import guru.springframework.didemo.manual.service.HelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setup() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.helloService = new HelloServiceImpl();
    }

    @Test
    public void testSayHello() {
        assertEquals(HelloServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
