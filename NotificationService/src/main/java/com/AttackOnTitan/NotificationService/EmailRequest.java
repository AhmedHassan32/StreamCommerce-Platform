package com.AttackOnTitan.NotificationService;

public record EmailRequest(
         String to,
         String subject,
         String text

) {
}
