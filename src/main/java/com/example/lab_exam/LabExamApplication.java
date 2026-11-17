package com.example.lab_exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabExamApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LabExamApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String userJson = """
                {
                    "userId": 101,
                    "username": "Anantha",
                    "role": "ADMIN"
                }
                """;

        String secretKey = "0123456789abcdef0123456789abcdef";

        String token = JwtTokenGenerator.generateToken(userJson, secretKey);

        System.out.println("\n======================================");
        System.out.println("Generated JWT Token:");
        System.out.println(token);
        System.out.println("======================================\n");
    }
}
