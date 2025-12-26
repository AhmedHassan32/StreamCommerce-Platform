package com.AttackOnTitan.UserService;

public record UserRequest(
        Integer id,
        String firstname,
        String lastname,
        String email,
        String passWord,
        Address address,
        String role
) {











}
