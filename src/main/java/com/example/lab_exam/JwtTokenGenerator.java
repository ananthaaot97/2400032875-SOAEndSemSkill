package com.example.lab_exam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;

public class JwtTokenGenerator {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String generateToken(String userJson, String secretKey) throws Exception {
        Map<String, Object> payload = OBJECT_MAPPER.readValue(
                userJson,
                new TypeReference<Map<String, Object>>() {}
        );

        SecretKey key = Keys.hmacShaKeyFor(
                secretKey.getBytes(StandardCharsets.UTF_8)
        );

        return Jwts.builder()
                .claims(payload)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(key)
                .compact();
    }
}
