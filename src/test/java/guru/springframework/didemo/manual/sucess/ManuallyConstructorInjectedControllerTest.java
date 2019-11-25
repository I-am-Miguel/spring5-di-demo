package guru.springframework.didemo.manual.sucess;

import guru.springframework.didemo.manual.controllers.ManuallyConstructorInjectedController;
import guru.springframework.didemo.manual.service.ManuallyHelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManuallyConstructorInjectedControllerTest {
    private ManuallyConstructorInjectedController manuallyConstructorInjectedController;

    @BeforeEach
    public void setup() {
        this.manuallyConstructorInjectedController = new ManuallyConstructorInjectedController(new ManuallyHelloServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals(ManuallyHelloServiceImpl.HELLO, manuallyConstructorInjectedController.sayHello());
    }
}
