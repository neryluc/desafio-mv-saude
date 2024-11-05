package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_notifications")

public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long   notificationId;
    private String title; //título da notificação
    private String description; //corpo da notificação
    private String type; //tipo de notificação

    @ManyToOne
    @JoinColumn(name = "userId")
    private Long userId; //pessoa que receberá a notificação

    @ManyToOne
    @JoinColumn(name = "notificationServiceId")
    private Long notificationService; //canal escolhido para receber as notificações 

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(Long notificationService) {
        this.notificationService = notificationService;
    }

   
    

}
