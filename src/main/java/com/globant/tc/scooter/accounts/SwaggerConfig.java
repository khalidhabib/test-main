package com.globant.tc.scooter.accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.globant.tc.scooter.accounts.api"))
                .paths(regex("/.*"))
                .build();
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Quarrio Front End API",
                "Spring Boot Quarrio front end API",
                "1.0",
                "Terms of Service",
                new Contact(
                        "Quarrio Pvt Ltd",
                        "http://quarrio.com",
                        "support@quarrio.com").toString() ,
                        "Apache License Version 2.0",
                        "https://www.apache.org/licesen.html"
        );
        return apiInfo;
    }
}