package com.apigateway.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebFluxSecurity
public class securityconfig {

    // @Bean
    // public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpssecurity)
    // {

    //     httpssecurity.authorizeExchange()
    //     .anyExchange()
    //     .authenticated()
    //     .and().oauth2Client().and()
    //     .oauth2ResourceServer()
    //     .jwt(null);

    // return httpssecurity.build();
    // };
}
