package guru.springframework.didemo.manual.failed;

import guru.springframework.didemo.manual.controllers.ManuallyPropertyInjectedController;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManuallyPropertyNotInjectedControllerTest {
    private ManuallyPropertyInjectedController manuallyPropertyInjectedController;

    @BeforeEach
    public void setup() {
        this.manuallyPropertyInjectedController = new ManuallyPropertyInjectedController();
    }

    @Test
    public void testSayHello() {
        assertThrows(NullPointerException.class, () -> manuallyPropertyInjectedController.sayHello());
    }
}
