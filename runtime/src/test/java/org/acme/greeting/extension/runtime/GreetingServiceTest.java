package org.acme.greeting.extension.runtime;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class GreetingServiceTest {

    @Inject
    GreetingService greetingService;

    @Test
    void shouldSayHello() {
        assertEquals("Hello World!", greetingService.sayHello());
    }
}
