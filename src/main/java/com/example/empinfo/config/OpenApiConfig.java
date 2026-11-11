package com.example.empinfo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI empInfoOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee Info API")
                        .description("CRUD operations for employees, backed by MS SQL Server")
                        .version("1.0.0"));
    }
}
