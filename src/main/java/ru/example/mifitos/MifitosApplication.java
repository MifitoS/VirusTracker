package ru.example.mifitos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MifitosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MifitosApplication.class, args);
    }

}
