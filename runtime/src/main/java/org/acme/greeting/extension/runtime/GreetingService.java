package org.acme.greeting.extension.runtime;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService {

    public String sayHello() {
        return "Hello World!";
    }
}
