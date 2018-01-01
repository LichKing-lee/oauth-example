package com.yong.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class SecurityConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        http.authorizeRequests()
                .anyRequest().permitAll()
                .antMatchers("/authorization-code-test").access("#oauth2.hasScope('read')");

//        http.authorizeRequests()
//                .antMatchers("/api/**")
//                .authenticated();
    }
}
