package io.gatehill.imposter.plugin.openapi;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import io.gatehill.imposter.plugin.openapi.service.ExampleService;
import io.gatehill.imposter.plugin.openapi.service.ExampleServiceImpl;
import io.gatehill.imposter.plugin.openapi.service.SchemaService;
import io.gatehill.imposter.plugin.openapi.service.SchemaServiceImpl;
import io.gatehill.imposter.plugin.openapi.service.ResponseTransmissionService;
import io.gatehill.imposter.plugin.openapi.service.ResponseTransmissionServiceImpl;
import io.gatehill.imposter.plugin.openapi.service.SpecificationService;
import io.gatehill.imposter.plugin.openapi.service.SpecificationServiceImpl;

/**
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
public class OpenApiModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpecificationService.class).to(SpecificationServiceImpl.class).in(Singleton.class);
        bind(ExampleService.class).to(ExampleServiceImpl.class).in(Singleton.class);
        bind(SchemaService.class).to(SchemaServiceImpl.class).in(Singleton.class);
        bind(ResponseTransmissionService.class).to(ResponseTransmissionServiceImpl.class).in(Singleton.class);
    }
}
