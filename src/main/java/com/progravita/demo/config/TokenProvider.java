package com.progravita.demo.config;

import java.util.Date;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.github.cdimascio.dotenv.Dotenv;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class TokenProvider {

    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        Date currentyDate = new Date();
        Date expirationToken = new Date(System.currentTimeMillis() + 3600 * Integer.parseInt(Dotenv.load().get("JWT_EXPIRATION_TIME")));
        String token = Jwts.builder()
            .setSubject(username)
            .setIssuedAt(currentyDate)
            .setExpiration(expirationToken)
            .signWith(SignatureAlgorithm.HS512, Dotenv.load().get("JWT_SECRET"))
            .compact();
        return token;
    }

    public String getUsernameOfJWT(String token) {
        Claims claims = Jwts.parser()
            .setSigningKey(Dotenv.load().get("JWT_SECRET"))
            .parseClaimsJws(token)
            .getBody();
        return claims.getSubject();
    }

    public Boolean verifyJwt(String token) {
        try {
            Jwts.parser()
                .setSigningKey(Dotenv.load().get("JWT_SECRET"))
                .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            throw new AuthenticationCredentialsNotFoundException("JWT was expired or invalid");
        }
    }
}
