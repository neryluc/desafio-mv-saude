package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_users")
public class Users {

    @Id

    private Long    userId;
    private String  userName; //nome do usuário
    private String  userEmail; //email do usuário

    @ManyToOne
    @JoinColumn(name = "notificationChannelId")
    private NotificationChannel notificationChannel; //canal escolhido para receber as notificações 

    public Users() {
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
    public NotificationChannel getNotificationService() {
        return notificationChannel;
    }
    public void setNotificationService(NotificationChannel notificationService) {
        this.notificationChannel = notificationService;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    } 
    

}
