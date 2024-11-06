package com.challenge.sistema_notificacoes.controller.dto;

import com.challenge.sistema_notificacoes.entities.NotificationService;

public record NotificationsDto(String title,
                               String description,
                               String type,
                               String userId,
                               NotificationService.notificationServices notificationServiceId) {

}
