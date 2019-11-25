package guru.springframework.didemo.manual.sucess;

import guru.springframework.didemo.manual.controllers.ManuallyPropertyInjectedController;
import guru.springframework.didemo.manual.service.ManuallyHelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManuallyPropertyInjectedControllerTest {
    private ManuallyPropertyInjectedController manuallyPropertyInjectedController;

    @BeforeEach
    public void setup() {
        this.manuallyPropertyInjectedController = new ManuallyPropertyInjectedController();
        this.manuallyPropertyInjectedController.helloService = new ManuallyHelloServiceImpl();
    }

    @Test
    public void testSayHello() {
        assertEquals(ManuallyHelloServiceImpl.HELLO, manuallyPropertyInjectedController.sayHello());
    }
}
