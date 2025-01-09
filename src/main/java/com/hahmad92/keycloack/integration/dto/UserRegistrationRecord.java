package com.hahmad92.keycloack.integration.dto;

public record UserRegistrationRecord(String username, String email, String firstName, String lastName, String password) {
}
//JSON
/**
 * { "username": "user1", "email": "hahad01.com", "firstName": "Hassan", "lastName": "Ahmad", "password": "password" }
 */