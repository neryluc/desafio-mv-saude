package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_service")
public class NotificationService {

    @Id

    private Long    notificationServiceId;
    private String  chosenService; //canal escolhido para recebimento das notificações
    private Long    userId;

    public NotificationService(Long notificationServiceId) {
        this.notificationServiceId = notificationServiceId;
    }

    public Long getNotificationServiceId() {
        return notificationServiceId;
    }
    public void setNotificationServiceId(Long notificationServiceId) {
        this.notificationServiceId = notificationServiceId;
    }
    public String getChosenService() {
        return chosenService;
    }
    public void setChosenService(String chosenService) {
        this.chosenService = chosenService;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
}
