package guru.springframework.didemo.framework.failed;

import guru.springframework.didemo.framework.controllers.PropertyInjectedController;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setup() {
        this.propertyInjectedController = new PropertyInjectedController();
    }

    @Test
    public void testSayHello() {
        assertNotNull(propertyInjectedController);
        assertThrows(NullPointerException.class, () -> propertyInjectedController.sayHello());
    }
}
