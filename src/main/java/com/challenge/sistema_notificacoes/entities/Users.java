package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long    userId;
    private String  userName; //nome do usuário
    private Long    notification; //notificação
    private Long    notificationService; //canal escolhido para receber as notificações 

    public Users(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Long getNotification() {
        return notification;
    }
    public void setNotification(Long notification) {
        this.notification = notification;
    }
    public Long getNotificationService() {
        return notificationService;
    }
    public void setNotificationService(Long notificationService) {
        this.notificationService = notificationService;
    } 

}
