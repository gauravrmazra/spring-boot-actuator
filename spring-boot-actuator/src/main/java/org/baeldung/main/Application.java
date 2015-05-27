package org.baeldung.main;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public static Endpoint<java.util.List<String>> exampleEndpoint() {
        return new Endpoint<java.util.List<String>>() {
            @Override
            public String getId() {
                return "example";
            }

            @Override
            public boolean isEnabled() {
                return true;
            }

            @Override
            public boolean isSensitive() {
                return false;
            }

            @Override
            public java.util.List<String> invoke() {
                java.util.List<String> l = new ArrayList<String>();
            	l.add("gaurav");
            	l.add("rasham");
                return l;
            }
        };
    }
}
