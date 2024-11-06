package com.challenge.sistema_notificacoes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.challenge.sistema_notificacoes.controller.dto.NotificationsDto;
import com.challenge.sistema_notificacoes.entities.Notifications;
import com.challenge.sistema_notificacoes.entities.Users;
import com.challenge.sistema_notificacoes.repository.NotificationsRepository;

@Service
public class NotificationService {

    private final NotificationsRepository notificationsRepository;

    public NotificationService(NotificationsRepository notificationsRepository) {
        this.notificationsRepository = notificationsRepository;
    }

    public void notificationInfo(NotificationsDto dto) {
        notificationsRepository.save(dto.toNotifications());
    }

    public List<Notifications> findByUser(Long userId) {
        return notificationsRepository.findByUser(userId);
    }
    
}
