package io.openapitools.swagger.example;

import io.swagger.v3.oas.models.OpenAPI;

import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Example enricher that appends " (Enriched)" to the title of the OpenAPI specification.
 */
public class TitleEnricher implements BiConsumer<OpenAPI, Set<Class<?>>> {

    @Override
    public void accept(OpenAPI swagger, Set<Class<?>> classes) {
        swagger.getInfo().setTitle(swagger.getInfo().getTitle() + " (Enriched)");
    }
}