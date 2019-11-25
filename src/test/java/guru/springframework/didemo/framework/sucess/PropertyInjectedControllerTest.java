package guru.springframework.didemo.framework.sucess;

import guru.springframework.didemo.framework.controllers.PropertyInjectedController;
import guru.springframework.didemo.manual.service.ManuallyHelloServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyInjectedControllerTest {

    @Autowired
    private PropertyInjectedController propertyInjectedController;

    @Test
    public void testSayHello() {
        assertNotNull(propertyInjectedController);
        assertEquals(ManuallyHelloServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
