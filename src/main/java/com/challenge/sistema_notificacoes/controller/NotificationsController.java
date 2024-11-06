package com.challenge.sistema_notificacoes.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.challenge.sistema_notificacoes.controller.dto.NotificationsDto;
import com.challenge.sistema_notificacoes.entities.Notifications;
import com.challenge.sistema_notificacoes.entities.Users;
import com.challenge.sistema_notificacoes.services.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {

    private final NotificationService notificationService;

    public NotificationsController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> notificationInfo(@RequestBody NotificationsDto dto) {
        notificationService.notificationInfo(dto);

        return ResponseEntity.accepted().build();
    }

    @GetMapping("/notifications/{userId}")
    public ResponseEntity<Notifications> getNotificationByUser(@PathVariable Users userId) {
        return (ResponseEntity<Notifications>) notificationService.findByUser(userId);
    }

}
