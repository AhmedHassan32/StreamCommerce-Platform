package com.AttackOnTitan.NotificationService;

public record OrderItemResponse(
        Integer id,
        String name,
        Integer price,
        Integer quantity

) {
}
