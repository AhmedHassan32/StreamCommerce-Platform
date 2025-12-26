package com.AttackOnTitan.UserService;

public record ActivateRequest(
        String email,
        Integer code
) {
}
