package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_notifications")

public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long    notificationId;
    private String  title; //título da notificação
    private String  description; //corpo da notificação
    private String  type; //tipo de notificação
    public  boolean markAsRead = false; //se foi lido ou não pelo usuário

    @ManyToOne
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    private Users user; //pessoa que receberá a notificação
    
    @ManyToOne
    @JoinColumn(name = "notificationServiceId", insertable = false, updatable = false)
    private NotificationService notificationService; //canal escolhido para receber as notificações

    public Notifications() {
    }

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

    public Users getUserId() {
        return user;
    }

    public void setUserId(Users userId) {
        this.user = userId;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public boolean isMarkAsRead() {
        return markAsRead;
    }

    public void setMarkAsRead(boolean markAsRead) {
        this.markAsRead = markAsRead;
    }

}
