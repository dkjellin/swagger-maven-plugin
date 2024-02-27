package io.openapitools.swagger.example;

import io.swagger.v3.oas.models.OpenAPI;

import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Example enricher that appends the string " (Enriched)" to the description of the OpenAPI specification.
 */
public class DescriptionEnricher implements BiConsumer<OpenAPI, Set<Class<?>>> {

    @Override
    public void accept(OpenAPI swagger, Set<Class<?>> classes) {
        swagger.getInfo().setDescription(swagger.getInfo().getDescription() + " (Enriched)");
    }
}