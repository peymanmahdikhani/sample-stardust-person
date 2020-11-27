package com.stardust.person;

import com.stardust.StardustApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

@Import(StardustApplication.class)
public class PersonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }

}
