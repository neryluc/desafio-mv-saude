package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_channels")
public class NotificationChannel {

    @Id

    private Long    notificationChannelId;
    private String  chosenService; //canal escolhido para recebimento das notificações

    public NotificationChannel() {
    }

    public NotificationChannel(Long notificationChannelId, String chosenService) {
        this.notificationChannelId = notificationChannelId;
        this.chosenService = chosenService;
    }

    public Long getnotificationChannelId() {
        return notificationChannelId;
    }
    public void setnotificationChannelId(Long notificationChannelId) {
        this.notificationChannelId = notificationChannelId;
    }
    public String getChosenService() {
        return chosenService;
    }
    public void setChosenService(String chosenService) {
        this.chosenService = chosenService;
    }

    public enum notificationServices {
        email((long) 1, "email"),
        push((long) 2, "push");

        private Long   id;
        private String type;

        notificationServices(Long id, String type){
            this.id   = id;
            this.type = type;
        }

        public NotificationChannel toNotificationService() {
            return new NotificationChannel(id, type);
        }
    }
}
