package com.AttackOnTitan.OrderService;

public record OrderItemResponse(
        Integer id,
        String name,
        Integer price,
        Integer quantity

) {
}
