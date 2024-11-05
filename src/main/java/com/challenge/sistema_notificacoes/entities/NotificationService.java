package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_service")
public class NotificationService {

    @Id

    private Long    notificationServiceId;
    private String  chosenService; //canal escolhido para recebimento das notificações

    public NotificationService() {
    }

    public NotificationService(Long notificationServiceId, String chosenService) {
        this.notificationServiceId = notificationServiceId;
        this.chosenService = chosenService;
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

    public enum notificationServices {
        email((long) 1, "email"),
        push((long) 2, "push");

        private Long   id;
        private String type;

        notificationServices(Long id, String type){
            this.id   = id;
            this.type = type;
        }

        public NotificationService toNotificationService() {
            return new NotificationService(id, type);
        }
    }



    
}
