package guru.springframework.didemo.manual.failed;

import guru.springframework.didemo.manual.controllers.ConstructorInjectedController;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConstructorNotInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setup() {
        this.constructorInjectedController = new ConstructorInjectedController();
    }

    @Test
    public void testSayHello() {
        assertThrows(NullPointerException.class, () -> constructorInjectedController.sayHello());
    }
}
