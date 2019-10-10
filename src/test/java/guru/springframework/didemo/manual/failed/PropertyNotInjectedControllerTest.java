package guru.springframework.didemo.manual.failed;

import guru.springframework.didemo.manual.controllers.PropertyInjectedController;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyNotInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setup() {
        this.propertyInjectedController = new PropertyInjectedController();
    }

    @Test
    public void testSayHello() {
        assertThrows(NullPointerException.class, () -> propertyInjectedController.sayHello());
    }
}
