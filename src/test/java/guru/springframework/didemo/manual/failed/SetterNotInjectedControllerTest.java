package guru.springframework.didemo.manual.failed;

import guru.springframework.didemo.manual.controllers.SetterInjectedController;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterNotInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    public void setup() {
        this.setterInjectedController = new SetterInjectedController();
    }

    @Test
    public void testSayHello() {
        assertThrows(NullPointerException.class, () -> setterInjectedController.sayHello());
    }
}
