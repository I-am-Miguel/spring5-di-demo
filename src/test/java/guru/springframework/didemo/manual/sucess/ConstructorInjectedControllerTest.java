package guru.springframework.didemo.manual.sucess;

import guru.springframework.didemo.manual.controllers.ConstructorInjectedController;
import guru.springframework.didemo.manual.service.HelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setup() {
        this.constructorInjectedController = new ConstructorInjectedController(new HelloServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals(HelloServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
