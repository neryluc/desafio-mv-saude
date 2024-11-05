package com.challenge.sistema_notificacoes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.challenge.sistema_notificacoes.controller.dto.NotificationsDto;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {

    @PostMapping
    public ResponseEntity<?> notificationInfo(@RequestBody NotificationsDto dto) {
            return null;
    }
}
