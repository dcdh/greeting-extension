package org.acme.greeting.extension.runtime;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService {

    @Inject
    GreetingConfig greetingConfig;

    public String sayHello() {
        return greetingConfig.hello();
    }
}
