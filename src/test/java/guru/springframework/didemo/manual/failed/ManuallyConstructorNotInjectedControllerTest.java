package guru.springframework.didemo.manual.failed;

import guru.springframework.didemo.manual.controllers.ManuallyConstructorInjectedController;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ManuallyConstructorNotInjectedControllerTest {
    private ManuallyConstructorInjectedController manuallyConstructorInjectedController;

    @BeforeEach
    public void setup() {
        this.manuallyConstructorInjectedController = new ManuallyConstructorInjectedController();
    }

    @Test
    public void testSayHello() {
        assertThrows(NullPointerException.class, () -> manuallyConstructorInjectedController.sayHello());
    }
}
