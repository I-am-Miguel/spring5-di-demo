package guru.springframework.didemo.manual.failed;

import guru.springframework.didemo.manual.controllers.ManuallySetterInjectedController;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManuallySetterNotInjectedControllerTest {
    private ManuallySetterInjectedController manuallySetterInjectedController;

    @BeforeEach
    public void setup() {
        this.manuallySetterInjectedController = new ManuallySetterInjectedController();
    }

    @Test
    public void testSayHello() {
        assertThrows(NullPointerException.class, () -> manuallySetterInjectedController.sayHello());
    }
}
