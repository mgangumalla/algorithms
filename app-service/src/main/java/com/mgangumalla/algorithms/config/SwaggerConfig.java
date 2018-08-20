package com.mgangumalla.algorithms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.base.Predicate;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final String FEEDBACK_BASE_PACKAGE = "com.mgangumalla.algorithms.controller";
    private static final String PATH_SIDEREAL = "/sidereal";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(FEEDBACK_BASE_PACKAGE))
                .paths(excludePath(PATH_SIDEREAL))
                .build();
    }

    Predicate<String> excludePath(final String path) {
        return new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return !input.contains(path);
            }
        };
    }

}
