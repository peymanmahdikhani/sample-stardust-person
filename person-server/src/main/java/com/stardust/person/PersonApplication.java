package com.stardust.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.ResourceUtils;

@SpringBootApplication
@PropertySource(ResourceUtils.CLASSPATH_URL_PREFIX + "application.properties")
@EntityScan("com.stardust")
@ComponentScan("com.stardust")
public class PersonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }

}
