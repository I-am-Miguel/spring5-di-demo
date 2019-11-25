package guru.springframework.didemo.manual.sucess;

import guru.springframework.didemo.manual.controllers.ManuallySetterInjectedController;
import guru.springframework.didemo.manual.service.ManuallyHelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManuallySetterInjectedControllerTest {
    private ManuallySetterInjectedController manuallySetterInjectedController;

    @BeforeEach
    public void setup() {
        this.manuallySetterInjectedController = new ManuallySetterInjectedController();
        this.manuallySetterInjectedController.setHelloService(new ManuallyHelloServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals(ManuallyHelloServiceImpl.HELLO, manuallySetterInjectedController.sayHello());
    }
}
