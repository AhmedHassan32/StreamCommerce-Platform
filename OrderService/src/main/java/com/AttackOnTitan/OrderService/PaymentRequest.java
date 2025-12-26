package com.AttackOnTitan.OrderService;

public record PaymentRequest(
        Integer customerId,
        String email,
        Integer orderId,
        Integer amount,
        PaymentMethod paymentMethod
) {
}
