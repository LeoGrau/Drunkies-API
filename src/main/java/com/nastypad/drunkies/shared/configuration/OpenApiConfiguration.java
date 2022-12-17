package com.nastypad.drunkies.shared.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    String title = "Drunkies API";
    String description = "This is Drunkies API. We developed this for Drunkies mobile and web app.";
    String name = "Leonardo Grau";
    String url = "https://github.com/LeoGrau";
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title(title)
                        .description(description)
                        .contact(new Contact().name(name).url(url))
                );
    }
}