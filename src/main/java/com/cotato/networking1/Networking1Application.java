package com.cotato.networking1;

import com.cotato.networking1.entity.SampleEntity;
import com.cotato.networking1.repository.SampleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Networking1Application {
    public static void main(String[] args) {

        System.out.println("테스트");
        SpringApplication.run(Networking1Application.class, args);
    }
}
