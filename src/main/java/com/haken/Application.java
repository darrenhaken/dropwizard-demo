package com.haken;

import com.haken.resources.ImageProcessResource;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application extends io.dropwizard.Application<AppConfiguration> {

    public static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(final String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        super.initialize(bootstrap);
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor()
                )
        );
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        LOGGER.info("com.haken.Application name: {}", configuration.getAppName());

        final ImageProcessResource resource = new ImageProcessResource();
        environment.jersey().register(resource);
    }
}
