package org.acme.greeting.extension.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "quarkus.log")
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface GreetingConfig {

}
